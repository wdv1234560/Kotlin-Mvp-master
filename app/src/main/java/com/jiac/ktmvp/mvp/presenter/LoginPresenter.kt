package com.jiac.ktmvp.mvp.presenter

import com.jiac.ktmvp.base.BasePresenter
import com.jiac.ktmvp.mvp.contract.LoginContract
import com.jiac.ktmvp.mvp.model.entity.HomeEntity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginPresenter(model: LoginContract.Model, view: LoginContract.View) : BasePresenter<LoginContract.Model, LoginContract.View>(model, view) {

    fun login() {

        mRootView?.showLoading(mModel?.login()!!)
    }

    open fun getHomeIndex(){
        val call = mModel?.getHomeIndex()
        call?.enqueue(object : Callback<HomeEntity> {
            override fun onResponse(call: Call<HomeEntity>?, response: Response<HomeEntity>?) {

                mRootView?.returnHomeData(response?.body()?.data)
            }

            override fun onFailure(call: Call<HomeEntity>?, t: Throwable?) {
            }
        })

    }
}


