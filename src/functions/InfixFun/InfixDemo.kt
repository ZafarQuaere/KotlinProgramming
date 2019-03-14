package com.example.kotlin.functions.InfixFun

/*
Functions (normal or extension) with just one parameter can be marked as Infix
and used with infix notation.
 */

val map = mapOf(1 to "one", 2 to "two", 3 to "three")
/*
In the above example, the expressions 1 to "one", 2 to "two" etc, are infix notations of the function calls 1.to("one") and 2.to("two") etc.
to() is an infix function that creates a Pair<A, B> from two values.
 */

infix fun Int.superOperation(i : Int) = this + i //this is an extens fun with infix.
infix fun String.shouldStartWith (s : String) = this+s

fun main(args: Array<String>) {
    println("Infix sum 1 superOperation 7 = ${1 superOperation 7}")
    println("Infix sum 6.superOperation(2) = ${6.superOperation(2)}")
    println("Infix ${"Kotlin" shouldStartWith "Ko"}")
    println("Infix ${"Kotlin" `shouldStartWith` " Ko"}")

    //high level infix example
    All your (Base are Belong to Us)

}


object All {
    infix fun your(base: Pair<Base, Us>) {}
}
object Base {
    infix fun are(belong: Belong) = this
}
object Belong
object Us
