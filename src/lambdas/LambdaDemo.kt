package com.example.kotlin.lambdas

fun main(args: Array<String>) {

    val sumLambda: (Int, Int) -> Int = { a: Int, b: Int ->
        a + b
    }
    println("sum of 5 + 5 using lambda is ${sumLambda(5, 5)}")

    val emptyList1 = listOf<Any>()
    val emptyList2 = emptyList<Any>()
    println("emptyList1.size = ${emptyList1.size}")
    println("emptyList2.size = ${emptyList2.size}")
}

