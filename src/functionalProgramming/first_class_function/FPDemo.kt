package com.example.kotlin.functionalProgramming.first_class_function

fun main(args: Array<String>) {

    println("Functional programming ${f(5)}")

    var i = 3

    fun cal(x : Long): Long{
        return x*i //it is accessing external resources (mutable state)
    }
    println(cal(1)) //0
    i++
    println(cal(1)) //1
    i++
    println(cal(1)) //2

    //here the value of x is same but outputs are different coz the change in external i value.


}

fun f(x: Long): Long {
    return x * x // doesnt accessing any external resources.

}