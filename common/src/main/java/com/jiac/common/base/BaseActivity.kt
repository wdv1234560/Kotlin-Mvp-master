package com.jiac.common.base

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.jiac.common.mvp.IPresenter
import com.jiac.common.mvp.IView

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