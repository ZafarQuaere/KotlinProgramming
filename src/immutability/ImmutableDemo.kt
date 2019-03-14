package com.example.kotlin.immutability

fun main(args: Array<String>) {
    val x: String = "abc"

    var y = x.capitalize()
    y = y + "def"
    println("x = $x y = $y")


    //to check the immutablity nature of VAL
    println("Calling 1st time ${MutableVal.myString}")
    println("Calling 2nd time ${MutableVal.myString}")
    println("Calling 3rd time ${MutableVal.myString}")//(3)
}

object MutableVal {
    var count = 0
    val myString: String = "Mutable" //custom getter will return modified value whch shows immutablity of val
   // const val myString: String = "Mutable" //const val will make it pure immutable, won't allow custom get method
        get() {//(1)
            return "$field ${++count}"//(2)
        }
}