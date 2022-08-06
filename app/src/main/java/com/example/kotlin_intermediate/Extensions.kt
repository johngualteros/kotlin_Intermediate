package com.example.kotlin_intermediate

import java.text.SimpleDateFormat
import java.util.*

fun Date?.customFormat() : String{
    val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ",Locale.getDefault())
    return formatter.format(this)
}
val Date.formatSize : Int
    get() = this.customFormat().length