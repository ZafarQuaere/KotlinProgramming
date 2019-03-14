package com.example.kotlin.functionalProgramming.unless

class UnlessDemo {

}

/**
 * Unless is a control statement that unless
 * executes a block of code if a condition is false; it's kind of a negated
    condition but without an if else clause.
 */
fun main(args: Array<String>) {
    val securityCheck = false
    unlessCondition(securityCheck){
        println("You can't access this website ")
    }
    securityCheck.let {  }
}

fun unlessCondition(condition: Boolean, block : () -> Unit){
    if (!condition )block()
}