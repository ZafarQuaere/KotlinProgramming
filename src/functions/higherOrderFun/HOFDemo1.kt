package com.example.kotlin.functions.higherOrderFun

fun performOperationOnEven(number: Int, operation: (Int) -> Int): Int { //accepting function as parameter
    if (number % 2 == 0) {
        return operation(number) //returning function as return
    } else {
        return number
    }
}

fun getAnotherFunction(n: Int): (String) -> Unit {
    return {
        println("n:$n it:$it")
    }
}

fun main(args: Array<String>) {

    println("Called with 4,(it*2) : ${performOperationOnEven(4, { it * 2 })}")
    println("Called with 5,(it*2): ${performOperationOnEven(5, { it * 2 })}")

    getAnotherFunction(0)("abc")
    getAnotherFunction(2)("def")
    getAnotherFunction(3)("ghi")
    //high(f = high { 1, "name" -> Unit })

}

fun high(f: (n: Int, s: String) -> Unit) {
    f(1, "Name")
}