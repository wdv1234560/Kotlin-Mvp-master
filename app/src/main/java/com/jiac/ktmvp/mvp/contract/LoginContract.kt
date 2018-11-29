package com.jiac.ktmvp.mvp.contract

import com.jiac.common.mvp.IModel
import com.jiac.common.mvp.IView
import com.jiac.ktmvp.mvp.model.entity.HomeEntity
import io.reactivex.Observable

interface LoginContract {
    interface View : IView {
        fun loginSuccess()
        fun returnHomeData(data: HomeEntity?)
    }

    interface Model : IModel {
        fun login():String
        fun getHomeIndex(): Observable<HomeEntity>
    }
}