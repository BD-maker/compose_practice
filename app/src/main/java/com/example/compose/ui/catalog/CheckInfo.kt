package com.example.compose.ui.catalog

import android.text.BoringLayout

data class CheckInfo(
    val title:String,
    var selected : Boolean = false,
    var onCheckedChange:(Boolean)-> Unit
)