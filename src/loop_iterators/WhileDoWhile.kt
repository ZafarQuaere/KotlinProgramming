package com.example.kotlin.LoopOrIterators

fun main(args: Array<String>) {

    //while loop
    var i = 1
   /* while (i < 10){
        if (i %2 == 0){
            println("EvenNumbers $i")
            i++
        }
    }*/

    do {
        i++
        if (i %2 == 0) {
            println("EvenNumbers $i")

        }
    }while (i <= 10)
}