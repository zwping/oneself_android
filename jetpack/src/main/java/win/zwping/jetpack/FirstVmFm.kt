package win.zwping.jetpack

import android.os.Bundle
import androidx.lifecycle.Observer
import win.zwping.code.comm.CommCallback
import win.zwping.code.utils.HandlerUtil
import win.zwping.frame.mvvm.BaseVmFm
import win.zwping.jetpack.databinding.FmFirstVmBinding

class FirstVmFm : BaseVmFm<FmFirstVmBinding>() {

    override fun setIsLazy(): Boolean {
        return true
    }

    override fun bindLayout() = R.layout.fm_first_vm

    override fun initView(savedInstanceState: Bundle?) {
        val liveData = DataBeanVModel.also {
            it.observe(this, Observer { bind.bean = it })
        }


        HandlerUtil.runOnUiThreadDelay(
            { Thread { liveData.setPostBean(DataBean("fm")) }.start() },
            2000
        )
    }

    override fun doBusiness() {
        println("vm db")
    }

}