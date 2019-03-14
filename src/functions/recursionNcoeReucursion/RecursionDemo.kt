package com.example.kotlin.functions.recursionNcoeReucursion

//TailRec Fibonocci function
fun tailRecFib(n : Long) : Long{

    tailrec fun go(n : Long, prev: Long, curr : Long): Long{
        return if (n == 0L) {
            prev
        }else{
            go(n-1, curr, prev+curr)
        }
    }
   return go(n,0,1)
}

//TailRec Factorial function
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

