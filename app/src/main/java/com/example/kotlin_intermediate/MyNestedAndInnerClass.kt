package com.example.kotlin_intermediate

class MyNestedAndInnerClass {
    private val one = 1

    private fun returnOne() :Int{
        return one
    }
    class MyNestedClass(){
        fun sum(numberOne : Int, numberTwo : Int) :Int{
            return numberOne + numberTwo
        }
    }
    inner class MyInnerClass(){
        fun sumTwo(number: Int) : Int{
            return number + one + returnOne()
        }
    }
}