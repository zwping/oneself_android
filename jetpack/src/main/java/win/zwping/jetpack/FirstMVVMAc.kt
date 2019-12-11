package win.zwping.jetpack

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import win.zwping.code.comm.CommCallback
import win.zwping.code.utils.HandlerUtil
import win.zwping.frame.base.BaseAc
import win.zwping.jetpack.databinding.AcFirestMvvmBinding


class FirstMVVMAc : BaseAc() {

    lateinit var bind: AcFirestMvvmBinding

    override fun bindLayout(callback: CommCallback<Any>?) {
    }

    override fun bindLayout() = 0


    override fun initView(savedInstanceState: Bundle?) {
        bind = DataBindingUtil.setContentView(this, R.layout.ac_firest_mvvm)
        val vm = DataBeanModel(DataBean("111"))
        bind.vm = vm
//
        HandlerUtil.runOnUiThreadDelay({ vm.ss("456");showToast(vm.bean.title) }, 1000)
    }

    override fun doBusiness() {
    }

}