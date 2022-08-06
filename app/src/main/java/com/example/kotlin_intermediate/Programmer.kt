package com.example.kotlin_intermediate

class Programmer(name : String ,age :Int, val language : String): Person(name,age) ,Car{
    override fun work() {
        println ("This person is coding")
        super.work()
    }
    fun sayLanguaje(){
        println("This programmer use $language")
    }

    override fun goWork() {
        println("I go to google")
    }

    override fun drive() {
        println("I go in my car")
    }
}