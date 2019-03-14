package com.example.kotlin.loopcontrol

fun main(args: Array<String>) {
    var i = 10

    /*for (i in 1..10){
        println("i = $i")
        if (i ==5 ){
            break
        }
    }*/

   myLoop@ for (i in 1..3){ //labelled for loop to break the outer for loop
        for (j in 1..3){
          //  println(" $i  $j")
            if (i ==2 && j==2)
            break@myLoop
        }
    }

    //continue stmt
    for (i in 1..10){

        if (i ==5 ){
            continue
        }
        println("i = $i")
    }
}