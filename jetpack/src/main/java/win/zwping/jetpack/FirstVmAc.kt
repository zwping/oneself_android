package win.zwping.jetpack

import android.os.Bundle
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.ac_firest_mvvm.*
import win.zwping.code.utils.HandlerUtil
import win.zwping.frame.mvvm.BaseVmAc
import win.zwping.jetpack.databinding.AcFirestMvvmBinding


class FirstVmAc : BaseVmAc<AcFirestMvvmBinding>() {

    override fun bindLayout() = R.layout.ac_firest_mvvm

    override fun initView(savedInstanceState: Bundle?) {
        pvp.setAdapterFm(supportFragmentManager, listOf(FirstVmFm(), FirstVmFm()))
        val livedata = DataBeanVModel.also {
            it.liveData.observe(this, Observer {
                bind.vm = it
            })
        }

        HandlerUtil.runOnUiThreadDelay({ livedata.setBean(DataBean("ac")) }, 1000)
    }

    override fun doBusiness() {
    }

}