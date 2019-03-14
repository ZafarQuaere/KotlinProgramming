package com.example.kotlin.conditionalStmtExpression

fun main(args: Array<String>) {
    val a : Int = 4
    val b : Int = 9

   // val biggestNumber = if (a > b) a else b //single line
    val biggestNumber = if (a > b){
        println("a is bigger ")
        a
    } else{
        println("b is bigger ")
        b
    }

}