package com.example.kotlin.inheritance

class Worker{
    fun work() = "* Working Hard *"
    private fun rest() = "* Restinggggg *"
}

fun Worker.work()= "*Not working so hard*" //creating extnsn fun with the same name as inside the class

fun <T> Worker.work(t: T) = "* Working on $t *"

fun Worker.rest() = "* Playing Games *"

fun main(args: Array<String>) {
    println("Calling methods ${Worker().work()}")
    println("Calling methods ${Worker().work("Zafar")}")

    println("Calling methods ${Worker().rest()}")
}