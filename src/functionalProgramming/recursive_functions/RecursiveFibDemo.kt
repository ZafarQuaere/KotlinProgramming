package com.example.kotlin.functionalProgramming.recursive_functions

import com.example.kotlin.utility.executionTime

//imperative implementation of recursive
fun fib(n: Long): Long {
    return when (n) {
        0L -> 0
        1L -> 1
        else -> {
            var a = 0L
            var b = 1L
            var c = 0L
            for (i in 2..n) {
                c = a + b
                a = b
                b = c
            }
            c
        }
    }
}

/*
let's take a look at a functional recursive implementation:
 */
fun functionalFib(n: Long): Long {
    fun go(n: Long, prev: Long, cur: Long): Long {
        return if (n == 0L) {
            prev
        } else {
            go(n - 1, cur, prev + cur)
        }
    }
    return go(n, 0, 1)
}

/*
Now let's check with its corresponding tailrec version, as follows:
 */
fun tailrecFib(n: Long): Long {
    tailrec fun go(n: Long, prev: Long, cur: Long): Long {
        return if (n == 0L) {
            prev
        } else {
            go(n - 1, cur, prev + cur)
        }
    }
    return go(n, 0, 1)
}

fun main(args: Array<String>) {
    println("fib :" + executionTime { fib(93) })
    println("functionalFib :" + executionTime { functionalFib(93) })
    println("tailrecFib :" + executionTime { tailrecFib(93) })
}