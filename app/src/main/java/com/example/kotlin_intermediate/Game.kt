package com.example.kotlin_intermediate

interface Game {
    val game : String
    fun play()
    fun stream(){
        println("i has stream today the $game")
    }
}