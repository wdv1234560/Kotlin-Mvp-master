package com.jiac.ktmvp.base

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

open class RepositoryManager:IRepositoryManager {
    @Synchronized
    override fun <T> obtainRetrofitService(service: Class<T>): T {
        return getRetrofit().create(service)
    }

    override fun <T> obtainCacheService(service: Class<T>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clarAllCache() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getRetrofit():Retrofit{

        return Retrofit.Builder().baseUrl(Api.BASE_URL).client(getOkHttpCliet())
                .addConverterFactory(GsonConverterFactory.create()).build()
    }

    /**
     * 设置公共头
     * */
    private fun getOkHttpCliet(): OkHttpClient? {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        return OkHttpClient.Builder()
                .addInterceptor(addHeaderInterceptor())
                .addInterceptor(httpLoggingInterceptor)
                .connectTimeout(30,TimeUnit.SECONDS)
                .readTimeout(30,TimeUnit.SECONDS)
                .writeTimeout(30,TimeUnit.SECONDS)
                .retryOnConnectionFailure(false)
                .build()
    }

    private fun addHeaderInterceptor(): Interceptor? {

        return Interceptor { chain ->

            val originalRequest = chain.request()
            val requestBulid = originalRequest.newBuilder().addHeader("token", "").method(originalRequest.method(), originalRequest.body())
            val request = requestBulid.build()
            chain.proceed(request)
        }

    }
}