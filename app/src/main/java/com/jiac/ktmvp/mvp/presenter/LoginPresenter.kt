package com.jiac.ktmvp.mvp.presenter

import com.jiac.ktmvp.base.BasePresenter
import com.jiac.ktmvp.mvp.contract.LoginContract

class LoginPresenter(model: LoginContract.Model, view: LoginContract.View) : BasePresenter<LoginContract.Model, LoginContract.View>(model, view) {

    fun login() {

        mRootView?.showLoading(mModel?.login()!!)
    }

    open fun getHomeIndex(){
        val call = mModel?.getHomeIndex()

    }
}


