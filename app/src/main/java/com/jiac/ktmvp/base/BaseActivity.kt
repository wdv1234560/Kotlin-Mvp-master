package com.jiac.ktmvp.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<P : IPresenter> : AppCompatActivity(), IView {
    var mPresenter: P? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(initLayoutId())
        initView()
        initData()
    }

    abstract fun initLayoutId(): Int

    abstract fun initView()

    abstract fun initData()

    override fun onDestory() {
        finish()
    }
}