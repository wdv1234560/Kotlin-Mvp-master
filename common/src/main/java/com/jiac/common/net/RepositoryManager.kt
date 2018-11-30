package com.jiac.common.net

import dagger.Lazy
import io.reactivex.Observable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method
import java.lang.reflect.Proxy
import javax.inject.Inject

open class RepositoryManager: IRepositoryManager {
    @Inject
    lateinit var mRetrofit: Lazy<Retrofit>

    @Synchronized
    override fun <T> obtainRetrofitService(service: Class<T>): T {
        return createWrapperService(service)
    }

    /**
     *根据 https://zhuanlan.zhihu.com/p/40097338 对 Retrofit 进行的优化
     *
     *
     */
    private fun <T> createWrapperService(serviceClass: Class<T>): T {
        return Proxy.newProxyInstance(serviceClass.classLoader,
                arrayOf(serviceClass),
                object :InvocationHandler{
                    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any {
                        if(method?.returnType == Observable::class.java){
//                      defer()这个方法的作用就是直到被观察者被订阅后才会创建被观察者。
                            return Observable.defer {
                                val service = getRetrofitService<T>(serviceClass)
                                // 执行真正的 Retrofit 动态代理的方法
                                (getRetrofitMethod(service, method)
                                        .invoke(service, args) as Observable<*>)
                                        .subscribeOn(Schedulers.io())
                            }.subscribeOn(Schedulers.single())
                        }
                        val service = getRetrofitService(serviceClass)
                        return getRetrofitMethod(service,method)
                    }
                }

        )as T
    }

    private fun <T> getRetrofitService(serviceClass: Class<T>): Any {
        return mRetrofit?.get()?.create(serviceClass)!!
    }

    @Throws(NoSuchMethodException::class)
    private fun <T:Any> getRetrofitMethod(service:T,method:Method?):Method{
        return service.javaClass.getMethod(method?.name,*method?.parameterTypes)
    }
    override fun <T> obtainCacheService(service: Class<T>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clarAllCache() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}