package com.example.kotlin.collections

fun main() {
    val numList = 1..10;
    val sumList = numList.reduce{x,y -> x+y}
    println("SumList Reduce : $sumList")

    val sumList2 = numList.fold(5){x,y -> x+y}
    println("SumList Folde : $sumList2")

}