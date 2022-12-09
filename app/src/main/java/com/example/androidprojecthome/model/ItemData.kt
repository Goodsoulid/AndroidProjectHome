package com.example.androidprojecthome.model

import com.example.androidprojecthome.adapter.Item


data class ItemData (
    val type: Int,
    val text: String
    ): Item {
    override fun type(): Int = type
}