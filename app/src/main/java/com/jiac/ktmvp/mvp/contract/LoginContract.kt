package com.jiac.ktmvp.mvp.contract

import com.jiac.ktmvp.base.IModel
import com.jiac.ktmvp.base.IView

interface LoginContract {
    interface View :IView{
        fun loginSuccess()
    }

    interface Model :IModel{
        fun login():String
    }
}