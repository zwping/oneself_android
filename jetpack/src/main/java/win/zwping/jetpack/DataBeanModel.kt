package win.zwping.jetpack

import androidx.databinding.BaseObservable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataBeanModel : ViewModel() {

    val bean by lazy { MutableLiveData<DataBean>() }

}