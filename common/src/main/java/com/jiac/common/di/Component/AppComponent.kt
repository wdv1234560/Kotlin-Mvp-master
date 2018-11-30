package com.jiac.common.di.Component

import com.jiac.common.base.BaseApplication
import com.jiac.common.di.module.AppModule
import com.jiac.common.di.module.ClientModule
import dagger.Component

/**
 * 类       名:
 * 说       明:
 * 修 改 记 录:
 * 版 权 所 有:   Copyright © 2017
 * 公       司:   深圳市深电能售电有限公司
 * version   0.1
 * date   2018/11/30 9:55
 * author   caojiaxu
 */
@Component(modules = arrayOf(AppModule::class,ClientModule::class))
interface AppComponent {
    fun inject(application: BaseApplication)
}