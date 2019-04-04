/*
package com.example.kotlin

//import arrow.core.*

fun divide(num: Int, den: Int): Int? {
    return if (num % den != 0) {
        null
    } else {
        num / den
    }
}

fun division(a: Int, b: Int, den: Int): Pair<Int, Int>? {
    val aDiv = divide(a, den)
    return when (aDiv) {
        is Int -> {
            val bDiv = divide(b, den)
            when (bDiv) {is
                is Int -> aDiv to bDiv
                else -> null
            }
        }
        else -> null
    }
}
//The division function takes three parameters—two integers (a, b) and a denominator (den) and returns
//a Pair<Int, Int>, if both numbers are divisible by den or null otherwise.

//We can express the same algorithm with Option

fun optionDivide(num: Int, den: Int): Option<Int> = divide(num, den).toOption()

fun optionDivision(a: Int, b: Int, den: Int): Option<Pair<Int, Int>> {

    val aDiv = optionDivide(a, den)
    return when (aDiv) {
        is Some -> {
            val bDiv = optionDivide(b, den)
            return when (bDiv) {
                is Some -> Some(aDiv.t to bDiv.t)
                else -> None
            }
        }
        else -> None
    }
}

*/
/*
fun flatMapDivision(a: Int, b: Int, den: Int): Option<Pair<Int, Int>> {
    return optionDivide(a, den).flatMap { aDiv: Int ->
        optionDivide(b, den).flatMap { bDiv: Int ->
            Some(aDiv to bDiv)
        }
    }
}*/

