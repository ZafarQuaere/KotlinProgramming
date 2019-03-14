package com.example.kotlin.operator

class ConditionalDemo

fun main(args: Array<String>) {

    val a = 10
    val b = 5
    val c = 15
    val flag = false
    var result: Boolean
    result = (a > b) && (a > c)
    println("(a>b) && (a>c) :" + result)
    result = (a > b) || (a > c)
    println("(a>b) || (a>c) :" + result)
    result = !flag
    println("!flag :" + result)

    for (x in 1..20) {
        if (x % 2 == 0) {
            continue
        }
        // println("Odd : $x")
        if (x == 15) break
    }


    forFunction()
}

fun forFunction() {

    var arr: Array<Int> = arrayOf(3, 6, 9)
    println()
    println()
    for (i in arr.indices) {
        println("Array3 of  ${arr[i]}")
    }

    for ((index, value) in arr.withIndex()) {
        println("Array Index : $index and Value : $value")
    }
}
