package com.jiac.ktmvp.mvp.model

import com.jiac.ktmvp.base.BaseModel
import com.jiac.ktmvp.base.IRepositoryManager
import com.jiac.ktmvp.mvp.contract.LoginContract

class LoginModel(iRepositoryManager: IRepositoryManager): BaseModel(iRepositoryManager) ,LoginContract.Model{
    override fun login(): String {

        return "Hello MVP"
    }
}