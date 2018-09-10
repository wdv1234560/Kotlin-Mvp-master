package com.jiac.ktmvp.mvp.contract

import com.jiac.ktmvp.base.IModel
import com.jiac.ktmvp.base.IView
import com.jiac.ktmvp.mvp.model.entity.HomeEntity
import retrofit2.Call

interface LoginContract {
    interface View :IView{
        fun loginSuccess()
        fun returnHomeData(data: HomeEntity?)
    }

    interface Model :IModel{
        fun login():String
        fun getHomeIndex(): Call<HomeEntity>
    }
}