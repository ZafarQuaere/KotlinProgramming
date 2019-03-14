package com.example.kotlin.functions.higherOrderFun

//higher order functions is a function which either accept other function as paramter
// or return other functions

fun main(args: Array<String>) {

    val numList = 1..20

    val evenList = numList.filter { it % 2 == 0 }
    /*evenList.forEach{
        n -> println(n)
    }*/


    val mult3 = makeMathFunc(10)
    println("5 * 3 = ${mult3(5)}")

    val add4 = addValues(5)
    println("Addition of 5 + 6 = ${add4(6)}")

    val funAsParam = {num1 : Int ->  num1 * 2}
    val numList1 = arrayOf(1,2,3,4,5)

    mathOnList(numList1, funAsParam)

}

fun mathOnList(numList : Array<Int>,myFunc : (num : Int) -> Int){
    for (num in numList){
        println("mathOnList : ${myFunc(num)}")
    }
}


fun addValues(num1: Int): (Int) -> Int = { num2 -> num1 + num2 }

fun makeMathFunc(num1 : Int) : (Int) -> Int = { num2 -> num1 * num2}