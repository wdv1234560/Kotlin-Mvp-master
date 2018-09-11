package com.jiac.ktmvp.mvp.presenter

import com.jiac.ktmvp.base.BasePresenter
import com.jiac.ktmvp.mvp.contract.HomeContract
import com.jiac.ktmvp.mvp.model.entity.HomeEntity
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

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
    //Rxjava获取接口数据
    fun getHomeIndex() {
        mModel?.getHomeIndex()
                ?.subscribeOn(Schedulers.io())
                ?.observeOn(AndroidSchedulers.mainThread())
                ?.doOnSubscribe {

                    mRootView?.showLoading("")
                }?.doAfterTerminate {
            mRootView?.hideLoading()

        }?.subscribe(object : Observer<HomeEntity> {
            override fun onSubscribe(d: Disposable) {
            }

            override fun onNext(t: HomeEntity) {
                mRootView?.returnHomeData(t.data.datas)
            }

            override fun onComplete() {
            }

            override fun onError(e: Throwable) {
            }
        })
    }
}