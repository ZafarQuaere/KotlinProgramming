package com.example.kotlin.functionalProgramming.recursive_functions

import com.example.kotlin.utility.executionTime

fun factorial(n: Long): Long {
    var result = 1L
    for (i in 1..n) {
        //  result = result*i
        result *= i
    }
    return result
}

/*
Now, let's take a look at a recursive implementation, no
loops, and no state change:
 */
fun functionalFactorial(n: Long): Long {
    fun go(n: Long, acc: Long): Long {
        return if (n <= 0) {
            acc
        } else {
            go(n - 1, n * acc)
        }
    }
    return go(n, 1)
}

/*
An optimized implementation is similar but with a tailrec modifier:
 */
fun tailrecFactorial(n: Long): Long {
    tailrec fun go(n: Long, acc: Long): Long {
        return if (n <= 0) {
            acc
        } else {
            go(n - 1, n * acc)
        }
    }
    return go(n, 1)
}
/*
To test which implementation is faster, we can write a poor's man profiler function:
 */


//Now check execution time for every factorial functions

fun main(args: Array<String>) {
    println("factorial :" + executionTime { factorial(30) })
    println("functionalFactorial :" + executionTime { functionalFactorial(30) })
    println("tailrecFactorial :" + executionTime { tailrecFactorial(30) })
}