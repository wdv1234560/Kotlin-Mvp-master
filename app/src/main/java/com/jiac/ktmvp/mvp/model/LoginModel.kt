package com.jiac.ktmvp.mvp.model

import com.jiac.ktmvp.base.BaseModel
import com.jiac.ktmvp.base.IRepositoryManager
import com.jiac.ktmvp.mvp.contract.LoginContract
import com.jiac.ktmvp.mvp.model.entity.HomeEntity
import com.jiac.ktmvp.net.service.ApiService
import retrofit2.Call

class LoginModel(iRepositoryManager: IRepositoryManager): BaseModel(iRepositoryManager) ,LoginContract.Model{
    override fun getHomeIndex(): Call<HomeEntity> {

        return mIRepositoryManager?.obtainRetrofitService(ApiService::class.java)!!.getHomeIndex()
    }

    override fun login(): String {

        return "Hello MVP"
    }


}