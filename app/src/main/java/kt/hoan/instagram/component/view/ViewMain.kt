package kt.hoan.instagram.component.view

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.baselayout.*
import kt.hoan.instagram.R
import kt.hoan.instagram.common.BaseContext
import kt.hoan.instagram.component.listmain.header.model.ItemHeader
import kt.hoan.instagram.component.listmain.main.adapter.AdapterListMain
import kt.hoan.instagram.component.view.model.InstaModel
import kt.hoan.instagram.component.view.model.TYPE

class ViewMain : BaseContext() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.baselayout)
        val adapter = AdapterListMain()
        lvMain.layoutManager = LinearLayoutManager(this)
        lvMain.adapter = adapter
        val array:ArrayList<ItemHeader> = ArrayList()
        val arr:ArrayList<InstaModel> = ArrayList()
        array.add(ItemHeader("nasdasd"))
        array.add(ItemHeader("nasdw"))
        array.add(ItemHeader("nasdd"))
        array.add(ItemHeader("nasdasdf"))
        array.add(ItemHeader("nasdasdf"))
        array.add(ItemHeader("nasdasdf"))
        array.add(ItemHeader("nasdasdf"))
        arr.add(InstaModel(TYPE.HEADER,array))
        arr.add(InstaModel(TYPE.BODY,null))
        arr.add(InstaModel(TYPE.BODY,null))
        arr.add(InstaModel(TYPE.BODY,null))
        arr.add(InstaModel(TYPE.BODY,null))
        arr.add(InstaModel(TYPE.BODY,null))
        arr.add(InstaModel(TYPE.BODY,null))
        arr.add(InstaModel(TYPE.BODY,null))
        arr.add(InstaModel(TYPE.BODY,null))
        arr.add(InstaModel(TYPE.BODY,null))
        arr.add(InstaModel(TYPE.BODY,null))
        arr.add(InstaModel(TYPE.BODY,null))
        arr.add(InstaModel(TYPE.BODY,null))
        adapter.setListMain(arr)


    }
}