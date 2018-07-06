package kt.hoan.instagram.component.listmain.main.viewmodel

import android.content.Context
import kt.hoan.instagram.component.listmain.main.model.ListMain

class ViewModelListMain(var context: Context,var listMains:ListMain? ) {
    private var listMain:ListMain? = null
    init {
        this.listMain = listMains
    }
    fun setListMain(listMain: ListMain)
    {
        this.listMain = listMain
    }
}