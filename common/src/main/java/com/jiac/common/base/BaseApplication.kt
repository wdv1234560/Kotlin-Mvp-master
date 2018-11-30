package com.jiac.common.base

import android.app.Application
import com.jiac.common.di.Component.DaggerAppComponent
import com.jiac.common.di.module.ClientModule

/**
 * version   0.1
 * date   2018/11/30 17:02
 * author   caojiaxu
 * desc
 */
class BaseApplication :Application() {

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent
                .builder()
//                .appModule(AppModule())
                .clientModule(ClientModule())
                .build().inject(this)
    }
}