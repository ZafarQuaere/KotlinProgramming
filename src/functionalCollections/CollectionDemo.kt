package com.example.kotlin.functionalCollections

val numbers: List<Int> = listOf(1, 2, 3, 4, 5)

fun main(args: Array<String>) {
   /* for (i in numbers) {
        println("i = $i")
    }*/
    println()
    //now we can replace the above for loop wiht lambdas and foreach as follows
   // numbers.forEach { i -> println("i = $i") }

    val numberTwice : List<Int> = listOf()//mutable list, cannot add elements
    val numberTwice2 : MutableList<Int> = mutableListOf()
    for (i in numbers){
     //   numberTwice.add()//CE to add elements to a list, it must a mutable, It is immutable now
        numberTwice2.add(i*2)
    }

    numberTwice2.forEach { i -> println("mutable list i = $i") }

    forSumofNumbers()
}

fun forSumofNumbers() {

    var sum = 0;
    for (i in numbers){
        sum += i

    }
    println(sum)

    val sum1 = numbers.sum()
    println(sum1)

    val sum2 = numbers.fold(0){
        acc, i -> //println("acc, i = $acc, $i")
        acc+i
    }
    println(sum2)
}


