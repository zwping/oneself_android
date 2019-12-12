package win.zwping.jetpack

import android.os.Bundle
import kotlinx.android.synthetic.main.fm_first_vm.*
import win.zwping.code.utils.HandlerUtil
import win.zwping.frame.mvvm.BaseVmFm
import win.zwping.jetpack.databinding.FmFirstVmBinding

class FirstVmFm : BaseVmFm<FmFirstVmBinding>() {

    override fun setIsLazy(): Boolean {
        return true
    }

    override fun bindLayout() = R.layout.fm_first_vm

    override fun initView(savedInstanceState: Bundle?) {
        HandlerUtil.runOnUiThreadDelay({ ptv?.text = "123" }, 1000)
    }

    override fun doBusiness() {
        println("vm db")
    }

}