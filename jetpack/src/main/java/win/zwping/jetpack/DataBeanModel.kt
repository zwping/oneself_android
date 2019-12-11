package win.zwping.jetpack

class DataBeanModel(var bean: DataBean) {

    var title = bean.title

    fun ss(s: String) {
        bean.title = s
    }

}