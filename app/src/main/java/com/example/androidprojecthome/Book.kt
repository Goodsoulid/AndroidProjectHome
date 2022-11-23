package com.example.androidprojecthome

import java.io.FileDescriptor


var bookList = mutableListOf<Book>()

class Book (
    var cover: Int,
    var author: String,
    var title: String,
    var description: String,
    val id: Int? = bookList.size
)