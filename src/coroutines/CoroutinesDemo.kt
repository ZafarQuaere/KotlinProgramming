package com.example.kotlin.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking{
   /* launch {
        delay(1000)
        println("World !")
    }
    print("Hello ")
    delay(2000)
*/
    val job = launch {
        delay(1000)
        println("Kotlin !")
    }
    print("Hello ")
    job.join()
}

/*
runBlocking: This function creates a coroutine and blocks the current Thread until the coroutine
finishes, returning its result value (Unit in this case).

launch: This function creates a new coroutine without blocking the current Thread and
returns Job (ignored here).

delay: This function is a suspending (more on this later) function that delays the current
coroutine without blocking the current thread.

suspend: A suspending function is a function that may suspend the execution of a coroutine,
without blocking the current Thread; therefore a suspending function must be called inside a

coroutine—it can't be invoked from normal code. The function must be marked with the
suspend modifier. So, delay can be invoked inside runBlocking and launch, both functions
(among others) take a suspending lambda as the last parameter—a suspending lambda is a
lambda marked with the suspend modifier.*/
