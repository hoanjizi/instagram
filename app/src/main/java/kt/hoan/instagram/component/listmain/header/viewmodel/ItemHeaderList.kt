package kt.hoan.instagram.component.listmain.header.viewmodel

import android.content.Context
import kt.hoan.instagram.component.listmain.header.model.ItemHeader

class ItemHeaderList(var context: Context,items:ItemHeader) {
    private var items:ItemHeader? = null
    init {
        this.items = items
    }
    fun setTextItem():String
    {
        return items!!.txtHeader
    }
    fun setItemHeader(items: ItemHeader)
    {
        this.items = items
    }
}