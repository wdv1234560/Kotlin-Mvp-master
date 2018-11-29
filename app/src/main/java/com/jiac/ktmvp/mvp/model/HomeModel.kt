package com.jiac.ktmvp.mvp.model

import com.jiac.common.mvp.BaseModel
import com.jiac.common.net.IRepositoryManager
import com.jiac.ktmvp.mvp.contract.HomeContract
import com.jiac.ktmvp.mvp.model.entity.HomeEntity
import com.jiac.ktmvp.net.service.ApiService
import io.reactivex.Observable

/**
 * 类       名:
 * 说       明:
 * 修 改 记 录:
 * 版 权 所 有:   Copyright © 2017
 * 公       司:   深圳市深电能售电有限公司
 * version   0.1
 * date   2018/9/10 16:22
 * author   caojiaxu
 */
class HomeModel(iRepositoryManager: IRepositoryManager): BaseModel(iRepositoryManager),HomeContract.Model {
    override fun getHomeIndex(): Observable<HomeEntity> {
        return mIRepositoryManager?.obtainRetrofitService(ApiService::class.java)?.getHomeIndex()!!
    }
}