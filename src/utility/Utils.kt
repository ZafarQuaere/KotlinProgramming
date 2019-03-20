package com.example.kotlin.utility

import kotlin.system.measureNanoTime

fun executionTime(body : ()-> Unit) : Long{
    val startTime = System.nanoTime()
    body()
    val endTime = System.nanoTime()

    return endTime - startTime
}

inline fun milliseconds(description: String, body: () -> Unit): String {
    return "$description:${measureNanoTime(body) / 1_000_000.00} ms"
}