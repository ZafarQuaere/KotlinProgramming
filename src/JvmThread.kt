package com.example.kotlin

import java.util.concurrent.Executors
import kotlin.concurrent.thread

//A JVM application on a typical development machine can easily handle 100 threads:
fun main(args: Array<String>) {
  /*  val threads = List(100){
        thread {
            Thread.sleep(1000)
            print(".")
        }
    }
    threads.forEach(Thread::join)*/

    val executor = Executors.newFixedThreadPool(1024)
    repeat(10000){
        executor.submit {
            Thread.sleep(1000)
            print('.')
        }
    }
    executor.shutdown()
}