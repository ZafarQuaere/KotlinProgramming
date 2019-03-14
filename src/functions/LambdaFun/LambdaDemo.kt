package com.example.kotlin.functions.LambdaFun

fun invokeSomeStuff(doSomeStuff: () -> Unit) {
    doSomeStuff()
}

fun main(args: Array<String>) {
  /*  invokeSomeStuff {
        println("do somestuff is called ")
    }

    println("Sum of 2 & 8 = ${sum(2, 8)}")
    println("Sum ${sum(50, 68)}")*/

    val reverse: (Int) -> Int//(1)
    reverse = { number ->
        var n = number
        var revNumber = 0
        while (n > 0) {
            val digit = n % 10
            revNumber = revNumber * 10 + digit
            n /= 10
        }
        revNumber
    }// (2)

    val addition : (Int,Int)->Int
    addition={
        num1,num2 ->
        num1+num2
    }

    println("Reverse of 502 : ${reverse(502)}")
    println("Reverse of 502 : ${revNum(502)}")
    println("Sum  of 50+ 2 : ${addition(50,2)}") //lambda call
    println("Sum  of 50+ 2 : ${sum(50,2)}") //lambda call


}


val sum = { x: Int, y: Int -> x + y } //function as a property


fun revNum(number: Int): Int {
    var reverseNum: Int = 0
    var n = number

    while (n > 0) {
        val digit = n % 10
        reverseNum = reverseNum * 10 + digit
        n /= 10
    }
    return reverseNum
}
