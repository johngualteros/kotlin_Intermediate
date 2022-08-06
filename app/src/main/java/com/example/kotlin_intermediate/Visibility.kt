package com.example.kotlin_intermediate

private class Visibility {
    var name: String? = null
    private fun sayMyName(){
        name?.let {
            println("My Name Is : $it")
        }?: run {
            println("Im not have name")
        }
    }
}
open class VisibilityTwo {
    protected fun sayMyNameTwo(){
        val visibility = Visibility()
        visibility.name = "John"
    }
}
class VisibilityThree : VisibilityTwo(){
    val age : Int? = null
    fun sayMyNameThree(){
        sayMyNameTwo()
    }
}