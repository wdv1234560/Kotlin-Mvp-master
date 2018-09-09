package com.jiac.ktmvp.base

open class BaseModel : IModel {

    var mIRepositoryManager: IRepositoryManager? = null

    constructor(iRepositoryManager: IRepositoryManager) {
        mIRepositoryManager = iRepositoryManager
    }

    override fun onDestroy() {
        mIRepositoryManager = null
    }
}