package win.zwping.jetpack

import android.os.Bundle
import win.zwping.frame.base.BaseFm

class FirstFm : BaseFm() {
    override fun bindLayout() = R.layout.fm_first_vm

    override fun initView(savedInstanceState: Bundle?) {
        println("fm iv")
    }

    override fun doBusiness() {

    }

}