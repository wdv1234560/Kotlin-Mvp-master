package com.jiac.ktmvp.ui.home

import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.jiac.common.base.BaseActivity
import com.jiac.ktmvp.R
import com.jiac.ktmvp.mvp.contract.HomeContract
import com.jiac.ktmvp.mvp.model.HomeModel
import com.jiac.ktmvp.mvp.model.entity.HomeEntity
import com.jiac.ktmvp.mvp.presenter.HomePresenter
import com.jiac.ktmvp.net.RepositoryManager
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.item_home.view.*

/**
 * 类       名:
 * 说       明:
 * 修 改 记 录:
 * 版 权 所 有:   Copyright © 2017
 * 公       司:   深圳市深电能售电有限公司
 * version   0.1
 * date   2018/9/10 16:20
 * author   caojiaxu
 */
class HomeActivity : BaseActivity<HomePresenter>(), HomeContract.View {
    var mDatas: ArrayList<HomeEntity.Datas> = ArrayList()
    override fun initLayoutId(): Int {
        return R.layout.activity_home
    }

    override fun initView() {
        srl.setColorSchemeResources(R.color.colorPrimary)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = HomeAdapter(mDatas)
    }

    override fun initData() {
        mPresenter = HomePresenter(HomeModel(RepositoryManager()), this)
        mPresenter?.getHomeIndex()
        srl.setOnRefreshListener {

            mPresenter?.getHomeIndex()
        }
    }

    override fun showLoading(message: String) {
        srl.isRefreshing =true
    }

    override fun hideLoading() {
        srl.isRefreshing = false
    }

    override fun returnHomeData(data: ArrayList<HomeEntity.Datas>) {
        mDatas.clear()
        mDatas.addAll(data)
        rv.adapter?.notifyDataSetChanged()

    }

    class HomeAdapter(val list: List<HomeEntity.Datas>) : RecyclerView.Adapter<HomeAdapter.HomeHolder>() {
        override fun getItemCount(): Int = list.size

        override fun onBindViewHolder(holder: HomeHolder, position: Int) {
            holder.itemView.textView.text = list[position].author
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
            return HomeHolder(view)
        }


        class HomeHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    }
}