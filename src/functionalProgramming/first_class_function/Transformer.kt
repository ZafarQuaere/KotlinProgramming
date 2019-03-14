package com.example.kotlin.functionalProgramming.first_class_function

class Transformer {

    fun upperCase(string: String):String{
        return string.toUpperCase()
    }

    companion object {
        fun lowerCased(str: String) : String{
            return str.toLowerCase()
        }
    }
}

fun main(args: Array<String>) {
    val transformer = Transformer()

    println(transform("transformer ", transformer::upperCase))
    println(transform("TRANSFORMER ", Transformer.Companion::lowerCased))

    //using lambda expression
    println(transform("TRANSFORMER ", { str -> str.substring(0..4) }))

    //shorter version of this using it implicit paramter
    println(transform("TRANSFORMER ", { it.substring(0..4) }))

    //If a function receives a lambda as the last parameter, the lambda can be passed outside the
    //parentheses:
    println(transform("TRANSFORMER Outside paranthesis ") { it.substring(0..17) })

   /* it is an implicit parameter (you don't declare it explicitly) that can be used in lambdas with just
    one parameter.*/


}