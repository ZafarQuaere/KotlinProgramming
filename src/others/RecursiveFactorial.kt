package com.example.kotlin.others

fun main(args: Array<String>) {
    println("Factorial of 5 ${recursiveFact(5)}")
}

fun recursiveFact(n: Long): Long {
    fun doRecursive(n: Long, multiple: Long): Long {
        if (n <= 0) {
            return multiple
        } else {
            return doRecursive(n - 1, n * multiple)
        }
    }
    return doRecursive(n, 1)
}