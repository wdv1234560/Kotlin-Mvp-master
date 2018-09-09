package com.jiac.ktmvp.mvp.presenter

import android.view.View
import com.jiac.ktmvp.base.BasePresenter
import com.jiac.ktmvp.base.IView
import com.jiac.ktmvp.mvp.contract.LoginContract

class LoginPresenter(model: LoginContract.Model, view: LoginContract.View) : BasePresenter<LoginContract.Model, LoginContract.View>(model, view) {

    fun login() {

        mRootView?.showLoading(mModel?.login()!!)
    }
}