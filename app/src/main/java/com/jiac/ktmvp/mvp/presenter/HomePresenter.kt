package com.jiac.ktmvp.mvp.presenter

import com.jiac.ktmvp.base.BasePresenter
import com.jiac.ktmvp.mvp.contract.HomeContract
import com.jiac.ktmvp.mvp.model.entity.HomeEntity
import retrofit2.Call
import retrofit2.Response

/**
 * 类       名:
 * 说       明:
 * 修 改 记 录:
 * 版 权 所 有:   Copyright © 2017
 * 公       司:   深圳市深电能售电有限公司
 * version   0.1
 * date   2018/9/10 16:21
 * author   caojiaxu
 */
class HomePresenter(model: HomeContract.Model, view: HomeContract.View) : BasePresenter<HomeContract.Model, HomeContract.View>(model, view) {

    fun getHomeIndex(){
        mRootView?.showLoading("")
        mModel?.getHomeIndex()?.enqueue(object :retrofit2.Callback<HomeEntity>{
            override fun onFailure(call: Call<HomeEntity>?, t: Throwable?) {
                mRootView?.hideLoading()
            }

            override fun onResponse(call: Call<HomeEntity>?, response: Response<HomeEntity>?) {
                mRootView?.returnHomeData(response?.body()?.data?.datas!!)
                mRootView?.hideLoading()
            }


        })
    }
}