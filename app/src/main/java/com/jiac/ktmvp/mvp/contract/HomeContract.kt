package com.jiac.ktmvp.mvp.contract

import com.jiac.common.mvp.IModel
import com.jiac.common.mvp.IView
import com.jiac.ktmvp.mvp.model.entity.HomeEntity
import io.reactivex.Observable

/**
 * 类       名:
 * 说       明:
 * 修 改 记 录:
 * 版 权 所 有:   Copyright © 2017
 * 公       司:   深圳市深电能售电有限公司
 * version   0.1
 * date   2018/9/10 16:23
 * author   caojiaxu
 */
interface HomeContract {
    interface View: IView {
        fun returnHomeData(data: ArrayList<HomeEntity.Datas>)
    }
    interface Model: IModel {
        fun getHomeIndex(): Observable<HomeEntity>

    }
}