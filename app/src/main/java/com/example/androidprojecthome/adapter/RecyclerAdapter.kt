package com.example.androidprojecthome.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidprojecthome.const.Const
import com.example.androidprojecthome.databinding.HeaderSectionBinding
import com.example.androidprojecthome.databinding.RecyclerItemBinding
import com.example.androidprojecthome.model.ItemData
import com.example.androidprojecthome.viewholder.HeaderViewHolder
import com.example.androidprojecthome.viewholder.ItemViewHolder

interface Item {
    fun type(): Int
}

class RecyclerAdapter(
    private val itemList: List<Item>
):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType) {
            Const.HEADER_SECTION -> HeaderViewHolder(
                HeaderSectionBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
            else -> ItemViewHolder(
                RecyclerItemBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
            )
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = itemList[position] as ItemData
        return when(getItemViewType(position)) {
            Const.HEADER_SECTION -> (holder as HeaderViewHolder).bind(item)
            else -> (holder as ItemViewHolder).bind(item)
        }
    }

    override fun getItemCount(): Int = itemList.size

    override fun getItemViewType(position: Int): Int {
        return when(itemList[position].type()) {
            0 -> Const.HEADER_SECTION
            else -> Const.ITEM_SECTION
        }
    }
}