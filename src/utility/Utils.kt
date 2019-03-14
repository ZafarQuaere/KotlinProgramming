package com.example.kotlin.utility

fun executionTime(body : ()-> Unit) : Long{
    val startTime = System.nanoTime()
    body()
    val endTime = System.nanoTime()

    return endTime - startTime
}