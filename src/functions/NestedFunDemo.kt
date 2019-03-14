package com.example.kotlin.functions

fun main(args: Array<String>) {

    fun nested():String{
        return "String from nested functions"
    }
    println("Nested Output : ${nested()}")
}