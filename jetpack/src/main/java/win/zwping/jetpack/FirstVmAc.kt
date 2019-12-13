package win.zwping.jetpack

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import kotlinx.android.synthetic.main.ac_firest_mvvm.*
import win.zwping.code.utils.FragmentUtil
import win.zwping.code.utils.HandlerUtil
import win.zwping.frame.mvvm.BaseVmAc
import win.zwping.jetpack.databinding.AcFirestMvvmBinding


class FirstVmAc : BaseVmAc<AcFirestMvvmBinding>() {

    override fun bindVmLayout() = R.layout.ac_firest_mvvm

    override fun initView(savedInstanceState: Bundle?) {
        val m = DataBeanModel().apply { this.bean = DataBean("333")}
        bind.vm = m

        HandlerUtil.runOnUiThreadDelay({ bind.vm = m.ss("111") }, 2000)

        pvp.setAdapterFm(supportFragmentManager, listOf(FirstVmFm(), FirstVmFm()))
        FragmentUtil.replace(supportFragmentManager, FirstVmFm(), R.id.fl)
    }

    override fun doBusiness() {
    }

}