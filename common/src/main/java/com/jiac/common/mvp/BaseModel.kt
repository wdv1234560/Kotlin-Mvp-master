package com.jiac.common.mvp

import com.jiac.common.net.IRepositoryManager

open class BaseModel : IModel {

    var mIRepositoryManager: IRepositoryManager? = null

    constructor(iRepositoryManager: IRepositoryManager) {
        mIRepositoryManager = iRepositoryManager
    }

    override fun onDestroy() {
        mIRepositoryManager = null
    }
}