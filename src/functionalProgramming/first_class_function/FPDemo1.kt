package com.example.kotlin.functionalProgramming.first_class_function


val capitalize = { str: String -> str.capitalize() }  //kotlin lambda expression
//above line is equivalent to below
/*val capitalize = object :Function1<String,String>{
    override fun myFun(p1: String): String {
        return p1.capitalize()
    }
}*/

fun reverse(str: String): String {
    return str.reversed()
}

fun main(args: Array<String>) {
    println("Capitalize : ${capitalize("zafar")}")
    println("transform call : ${transform("zafar", capitalize)}")

    println("transform call : ${transform("zafar", ::reverse)}")
    println("Object call : ${transform("zafar", MyUtils::doNothing)}")
}

//this is another method call higher order functions
fun transform(str: String, fn: (String) -> String): String {
    return fn(str)
}

//now we can generalize transform
fun <T> transform(t: T, fn: (T) -> T): T {
    return t
}

object MyUtils {
    fun doNothing(str: String): String {
        return str
    }
}