package com.example.kotlin.arrowsconcept

import arrow.syntax.function.complement
import java.util.function.Predicate

fun main(args: Array<String>) {

   val evenPredicate : (Int) -> Boolean = { i : Int -> i%2 == 0}
    //val evenPredicate: Predicate<Int> = { i: Int -> i % 2 == 0 }
    val oddPredicate : (Int) -> Boolean = evenPredicate.complement()

    val numbers : IntRange = 1..10

    val evenNumbers : List<Int> = numbers.filter(evenPredicate)
    val oddNumbers : List<Int> = numbers.filter(oddPredicate)

    println(evenNumbers)
    println(oddNumbers)

}