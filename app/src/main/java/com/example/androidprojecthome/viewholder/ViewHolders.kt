package com.example.androidprojecthome.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.androidprojecthome.databinding.HeaderSectionBinding
import com.example.androidprojecthome.databinding.RecyclerItemBinding
import com.example.androidprojecthome.model.ItemData

class HeaderViewHolder(
private val binding: HeaderSectionBinding
): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: ItemData) {
        binding.textHeader.text = item.text
    }
}

class ItemViewHolder(
    private val binding: RecyclerItemBinding
): RecyclerView.ViewHolder(binding.root) {
    fun bind(item: ItemData) {
        binding.textItem.text = item.text

    }
}