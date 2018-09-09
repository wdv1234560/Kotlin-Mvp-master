package com.jiac.ktmvp.ui.login

import android.widget.Toast
import com.jiac.ktmvp.R
import com.jiac.ktmvp.base.BaseActivity
import com.jiac.ktmvp.base.RepositoryManager
import com.jiac.ktmvp.mvp.contract.LoginContract
import com.jiac.ktmvp.mvp.model.LoginModel
import com.jiac.ktmvp.mvp.presenter.LoginPresenter
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity : BaseActivity<LoginPresenter>(), LoginContract.View {
    override fun loginSuccess() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun initLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initView() {
        mPresenter = LoginPresenter(LoginModel(RepositoryManager()), this)
        button.setOnClickListener {
            mPresenter?.login()

        }
    }

    override fun initData() {
    }

    override fun showLoading(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun hideLoading() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
