package com.jiac.common.di.module

import dagger.Module
import dagger.Provides
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * version   0.1
 * date   2018/11/30 10:08
 * author   caojiaxu
 * desc     提供一些三方库客户端实例的 {@link Module}
 */
@Module
class ClientModule {
    companion object {

        const val TIME_OUT: Long = 10
    }

    @Singleton
    @Provides
    fun provideRetrofit(builder: Retrofit.Builder, client: OkHttpClient, httpUrl: HttpUrl): Retrofit {
        return builder.baseUrl(httpUrl)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    @Singleton
    @Provides
    fun provideRetrofitBuilder(): Retrofit.Builder {
        return Retrofit.Builder()
    }


    @Provides
    fun provideClient(builder: OkHttpClient.Builder,interceptor:Interceptor,interceptors:List<Interceptor>): OkHttpClient {
        val retrofitConfig = builder
                .addInterceptor(HttpLoggingInterceptor())
                .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(TIME_OUT, TimeUnit.SECONDS)
                .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
                .retryOnConnectionFailure(false)

        if(interceptor!=null){
            retrofitConfig.addInterceptor(interceptor)
        }
        if(interceptors!= null&&interceptors.size!=0){
            for (interceptor in interceptors){
                retrofitConfig.addInterceptor(interceptor)
            }
        }

        return retrofitConfig.build()
    }

    @Provides
    fun provideClientBulider(): OkHttpClient.Builder {
        return OkHttpClient.Builder()
    }

    @Singleton
    @Provides
    fun provideInterceptor(interceptor: Interceptor):Interceptor{
        return interceptor
    }
    @Provides
    fun providesInterceptor(): Interceptor {
        return Interceptor {

            chain ->
            val originalRequest = chain.request()
            val requestBuild = originalRequest.newBuilder().addHeader("token", "").method(originalRequest.method(), originalRequest.body())
            chain.proceed(requestBuild.build())
        }
    }

}