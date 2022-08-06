package com.example.kotlin_intermediate

open class Person (name : String, age : Int) : Work() ,Game {
    open fun work(){
        println("This person is working")
    }

    override fun goWork() {
        println("This person go to work")
    }

    override val game: String
        get() = "Warzone"

    override fun play() {
        println("Im Playing a game")
    }
}