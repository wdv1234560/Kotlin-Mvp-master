package com.jiac.ktmvp.base

open class BasePresenter<M : IModel, V : IView> : IPresenter {

    var mModel: M? = null
    var mRootView: V? = null

    constructor(model: M,view:V) {
        this.mModel = model
        this.mRootView = view
    }

}