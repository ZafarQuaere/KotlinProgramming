package com.example.kotlin.coroutines

import kotlin.concurrent.thread

//Let's start with a simple example without coroutines:
fun main(args: Array<String>) {
    thread {
        Thread.sleep(1000)
        println("World!")
    }
    print("Hello ")
    Thread.sleep(2000)
    println()

   /* In this version, we have a reference to our thread called, computation; at the end, we wait for the
    join() method to finish. This is smarter than just waiting for a fixed amount of time, as real-life
    computations could have different execution times.*/
    val computation = thread {
        Thread.sleep(1000);
        println("Kotlin!")
    }
    print("Hello ")
    computation.join()
}