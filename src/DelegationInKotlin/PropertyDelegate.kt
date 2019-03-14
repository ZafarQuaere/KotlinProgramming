package com.example.kotlin.DelegationInKotlin

import org.jetbrains.annotations.NotNull
import kotlin.properties.Delegates

/*Think of a situation where you need to declare a property at the class level, but you don't have the
initial value for the variable there. You'll get the value at some later point, but before the property
is actually used, and you're confident that the property will get initialised before using and it'll not
be null. But, as per Kotlin syntax, you must initialize a property at the time of initializing. The
quick fix is to declare it as a nullable var property, and assign a default null value. But as we
mentioned earlier, since you are confident that the variable will not be null while using it, you are
not willing to declare it as nullable.*/

//Delegates.notNull is here to save you in this scenario. Have a look at the following program:
var nullString : String = ""; //we cant have a string var without initilizing it.

var notNullString : String by Delegates.notNull<String>()
var myString : String by Delegates.notNull<String>()//The by operator is a reserved keyword in Kotlin, to be used with delegates.
var myInt : Int by Delegates.notNull<Int>()

/*But doesn't the variable declaration—by Delegates.notNull() sound awkward? The Kotlin team also
thought the same way. That's why from Kotlin 1.1 they added a simple keyword—lateinit, to
achieve the same objective. As it simply states about late initialization, it should be simply lateinit*/

lateinit var notNullString1 :  String
lateinit var notInit1 :  String

fun main(args: Array<String>) {
    notNullString = "Initial Value"
    notNullString1 = "Lateinit value"
    println(notNullString)
    //println(myInt)
    println(notNullString1)
    println("Not yet initialised")
    println(myLazy)

}
/*
Unlike lateinit and Delegates.notNull(), you must specify how you want to initialize the variable at the
time of declaration.The initialization will not be called until the variable is actually used. That's why this mapDelegate is called lazy*/

val myLazy : String by lazy { println("just initiliAzed ")
    "My lazy variable"
}
