package kt.hoan.instagram.component.listmain.header.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kt.hoan.instagram.R
import kt.hoan.instagram.component.listmain.header.model.ItemHeader
import kt.hoan.instagram.component.listmain.header.viewmodel.ItemHeaderList
import kt.hoan.instagram.databinding.ItemHeaderListBinding
import java.util.*

class AdapterListHeader :RecyclerView.Adapter<AdapterListHeader.ListHeaderItem>() {
    private var itemList : List<ItemHeader>? = Collections.emptyList()
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ListHeaderItem {
        return ListHeaderItem(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.item_header_list,parent,false))
    }
    fun setListItemHeader(items:List<ItemHeader>)
    {
        this.itemList = items
        this.notifyDataSetChanged()
    }

    override fun getItemCount(): Int = itemList!!.size

    override fun onBindViewHolder(holder: ListHeaderItem, position: Int) {
        holder.onBindding(itemList!![position])
    }

    class ListHeaderItem(itemHeaderListBinding: ItemHeaderListBinding) : RecyclerView.ViewHolder(itemHeaderListBinding.root)
    {
        private var mItemBinding:ItemHeaderListBinding = itemHeaderListBinding
        fun onBindding(items:ItemHeader)
        {
            if (mItemBinding.itemheader==null)
            {
                mItemBinding.itemheader = ItemHeaderList(itemView.context,items)
            }
            else{
                mItemBinding.itemheader!!.setItemHeader(items)
            }
            mItemBinding.executePendingBindings()
        }
    }
}