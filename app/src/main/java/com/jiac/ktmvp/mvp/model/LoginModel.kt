package com.jiac.ktmvp.mvp.model

import com.jiac.common.mvp.BaseModel
import com.jiac.common.net.IRepositoryManager
import com.jiac.ktmvp.mvp.contract.LoginContract
import com.jiac.ktmvp.mvp.model.entity.HomeEntity
import com.jiac.ktmvp.net.service.ApiService
import io.reactivex.Observable

class LoginModel(iRepositoryManager: IRepositoryManager): BaseModel(iRepositoryManager) ,LoginContract.Model{
    override fun getHomeIndex(): Observable<HomeEntity> {
        return mIRepositoryManager?.obtainRetrofitService(ApiService::class.java)?.getHomeIndex()!!
    }

    override fun login(): String {

        return "Hello MVP"
    }


}