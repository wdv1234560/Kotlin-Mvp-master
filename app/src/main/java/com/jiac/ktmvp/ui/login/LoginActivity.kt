package com.jiac.ktmvp.ui.login

import android.widget.Toast
import com.jiac.common.base.BaseActivity
import com.jiac.common.net.RepositoryManager
import com.jiac.ktmvp.R
import com.jiac.ktmvp.mvp.contract.LoginContract
import com.jiac.ktmvp.mvp.model.LoginModel
import com.jiac.ktmvp.mvp.model.entity.HomeEntity
import com.jiac.ktmvp.mvp.presenter.LoginPresenter

class LoginActivity : BaseActivity<LoginPresenter>(), LoginContract.View {

    override fun loginSuccess() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        mPresenter = LoginPresenter(LoginModel(RepositoryManager()), this)
    }

    override fun initData() {
    }

    override fun returnHomeData(data: HomeEntity?) {
    }

    override fun showLoading(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun hideLoading() {
    }
}
