package com.jiac.common.mvp

interface IView {

    fun showLoading(message:String)
    fun hideLoading()
    fun onDestory()
}