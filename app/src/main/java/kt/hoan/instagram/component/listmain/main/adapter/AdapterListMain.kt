package kt.hoan.instagram.component.listmain.main.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kt.hoan.instagram.R
import kt.hoan.instagram.component.listmain.header.adapter.AdapterListHeader
import kt.hoan.instagram.component.listmain.header.model.ItemHeader
import kt.hoan.instagram.component.view.model.InstaModel
import kt.hoan.instagram.component.view.model.TYPE
import kt.hoan.instagram.component.view.viewmodel.ItemBodyViewModel
import kt.hoan.instagram.databinding.ItemFieldBinding
import kt.hoan.instagram.databinding.ItemListMainBinding
import java.util.*

class AdapterListMain : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var objects:InstaModel = listMains[position]
        when(objects.type)
        {
            TYPE.HEADER ->{
                val holderListMain:ViewHolderListMain = holder as ViewHolderListMain
                holderListMain.getRecycleviewHeader(objects.items!!)
            }
            else->{
                val holderBody:ViewHolderBody = holder as ViewHolderBody
                holderBody.getRecycleviewBody()
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, type: Int): RecyclerView.ViewHolder {
        return when(type)
        {
            TYPE.HEADER->ViewHolderListMain(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_list_main, parent, false))
            else ->ViewHolderBody(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_field, parent, false))
        }
    }


    private var listMains: List<InstaModel> = Collections.emptyList()

    fun setListMain(listMains: List<InstaModel>)
    {
        this.listMains = listMains
        this.notifyDataSetChanged()
    }
    override fun getItemViewType(position: Int): Int {
        return when(position)
        {
            0-> TYPE.HEADER
            else-> TYPE.BODY
        }
    }


    override fun getItemCount(): Int = listMains.size


    class ViewHolderListMain(private var itemListMainBinding: ItemListMainBinding) : RecyclerView.ViewHolder(itemListMainBinding.root) {
        fun getRecycleviewHeader(array:List<ItemHeader>) {
            val recyclerView = itemListMainBinding.lvItemMain
            val linearLayoutManager = LinearLayoutManager(itemView.context)
            linearLayoutManager.orientation = LinearLayoutManager.HORIZONTAL
            recyclerView.layoutManager = linearLayoutManager
            val adapterListHeader = AdapterListHeader()
            recyclerView.adapter = adapterListHeader
            adapterListHeader.setListItemHeader(array)
        }

    }
    class ViewHolderBody(private var itemFieldBinding: ItemFieldBinding):RecyclerView.ViewHolder(itemFieldBinding.root)
    {
        fun getRecycleviewBody(){
            if (itemFieldBinding.itembody==null)
            itemFieldBinding.itembody = ItemBodyViewModel()
        }
    }

}
