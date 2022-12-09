package com.example.androidprojecthome.viewmodel

import androidx.lifecycle.ViewModel
import com.example.androidprojecthome.adapter.Item
import com.example.androidprojecthome.const.Const
import com.example.androidprojecthome.model.ItemData

class RecyclerViewModel : ViewModel() {
    private val item: MutableList<Item> = mutableListOf()

    fun setData() {
        //Name Section
        item.add(ItemData(Const.HEADER_SECTION, "Name Section"))
        item.add(ItemData(Const.ITEM_SECTION, "Chelsea"))
        item.add(ItemData(Const.ITEM_SECTION, "Steven"))
        item.add(ItemData(Const.ITEM_SECTION, "Lucas"))

        //Adress Section
        item.add(ItemData(Const.HEADER_SECTION, "Adress Section"))
        item.add(ItemData(Const.ITEM_SECTION, "First Street"))
        item.add(ItemData(Const.ITEM_SECTION, "Second Street"))
        item.add(ItemData(Const.ITEM_SECTION, "Third Street"))


        //Gender Section
        item.add(ItemData(Const.HEADER_SECTION, "Gender Section"))
        item.add(ItemData(Const.ITEM_SECTION, "Female"))
        item.add(ItemData(Const.ITEM_SECTION, "Male"))
        item.add(ItemData(Const.ITEM_SECTION, "Male"))
    }

    fun getData(): List<Item> = item
}