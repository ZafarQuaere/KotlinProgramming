package com.example.kotlin.lazy



fun main(args: Array<String>) {
//    val size = listOf(2 + 1, 3 * 2, 1 / 0, 5 - 4).size
    //println(size)//this is will be an arithmetic exception as divided by zero

    val size1 = listOf({ 2 + 1 }, { 3 * 2 }, { 1 / 0 }, { 5 - 4 }).size
    println(size1)
}
