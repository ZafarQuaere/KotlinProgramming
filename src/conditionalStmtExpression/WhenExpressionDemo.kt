package com.example.kotlin.conditionalStmtExpression

fun main(args: Array<String>) {

    val x = 14

    when (x){
      0,1 -> println("The value of x is 0 or 1")
        2 -> println("The value of x is 2")
        3,4,5,6,7,8,9,10 -> println("The value of x is 3, 4,5,6,7,8,9")
        in 10..15 -> println("The value of x is between 10 to 15")
        else -> {
            println("value is something else")
            println("value is something else")
            println("value is something else")
        }
    }

    //another when example
    val str :String = when(x){
        0,1 -> "The value of x is 0 or 1"
        2 -> "The value of x is 2"
        3,4,5,6,7,8,9,10 -> "The value of x is 3, 4,5,6,7,8,9"
        in 10..15 -> "The value of x is between 10 to 15"
        else -> {
            "value is something else"
        }
    }
    println("The string value is $str")
}