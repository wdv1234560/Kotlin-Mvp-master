package com.jiac.ktmvp.net.service

import com.jiac.ktmvp.mvp.model.entity.HomeEntity
import retrofit2.Call
import retrofit2.http.GET

/**
 * 类       名:
 * 说       明:
 * 修 改 记 录:
 * 版 权 所 有:   Copyright © 2017
 * 公       司:   深圳市深电能售电有限公司
 * version   0.1
 * date   2018/9/10 14:18
 * author   caojiaxu
 */
interface ApiService {
    @GET("article/list/0/json")
    fun getHomeIndex():Call<HomeEntity>
}