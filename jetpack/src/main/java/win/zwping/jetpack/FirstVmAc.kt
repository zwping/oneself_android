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
        bind.vm = DataBeanModel(DataBean("333"))

        ss()
        pvp1?.setAdapterFm(supportFragmentManager, listOf(FirstFm(), FirstFm()))

        HandlerUtil.runOnUiThreadDelay({
            ss()
        }, 2000)

        FragmentUtil.replace(supportFragmentManager, FirstVmFm(), R.id.fl)
    }

    override fun doBusiness() {
    }

    private fun ss() {
        pvp?.adapter = object : FragmentStatePagerAdapter(supportFragmentManager,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT        ) {
            override fun getItem(position: Int) = listOf(FirstVmFm(), FirstVmFm()).get(position)

            override fun getCount() = 2

        }
    }

}