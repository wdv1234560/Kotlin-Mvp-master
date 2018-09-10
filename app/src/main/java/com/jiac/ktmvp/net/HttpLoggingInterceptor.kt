package com.jiac.ktmvp.net

import android.util.Log
import okhttp3.Interceptor
import okhttp3.MediaType
import okhttp3.Response

/**
 * 类       名:
 * 说       明:
 * 修 改 记 录:
 * 版 权 所 有:   Copyright © 2017
 * 公       司:   深圳市深电能售电有限公司
 * version   0.1
 * date   2018/9/10 11:27
 * author   caojiaxu
 */
open class HttpLoggingInterceptor : Interceptor {
    var printLevel: Level? = null

    enum class Level {
        NONE,
        REQUEST,
        RESPONSE,
        ALL
    }

    override fun intercept(chain: Interceptor.Chain?): Response {

        val request = chain?.request()

        var logRequest = printLevel == Level.ALL || (printLevel != Level.NONE && printLevel == Level.REQUEST)

        if (logRequest) {
            if (request?.body() != null && isParseable(request?.body()?.contentType())) {
                Log.d("HttpLoggingInterceptor", request?.body().toString())
            }
        }

        return chain?.proceed(request)!!
    }

    private fun isParseable(contentType: MediaType?): Boolean {
        return true
    }
}