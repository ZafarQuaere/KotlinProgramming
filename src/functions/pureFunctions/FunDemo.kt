package com.example.kotlin.functions.pureFunctions

fun main(args: Array<String>){

    val array = arrayListOf<Int>(1,2,3,4,5)
    array.forEach{
        println(it)
    }
    fun add(num1 : Int,num2 : Int) :Int = num1 + num2
    println("Addition of 5 + 6 = ${add(5,6)}")

    fun substract (num1 : Int = 1, num2 : Int =1) = num1-num2
    println("Substraction of 6 - 5 = ${substract(6,5)}")
    println("Substraction of 6 - 5 named param = ${substract(num1 = 6, num2 = 5)}")

    fun sayHello(name : String):Unit = println("Hello $name")
    sayHello("Zafar Kotlin")

    println("This function returs two values for 8 ${returnTwo(8)}")
    println("This function returs three  values for 8 ${returnThree(8)}")

    println("Sum of 1..6  is ${getSum(1, 2, 3, 4, 5, 6)}")

    val multiply = {num1 : Int,num2 : Int -> num1*num2}

    println("multiply of 5 and 4 is : ${multiply(5,4)}")

}

fun facto(x : Int ):Int{
    tailrec fun factTor(y : Int,z : Int) :Int{
        if (y == 0)return z
        else
        return factTor(y-1 ,y*z)
    }

    return factTor(x,1)
}

fun getSum(vararg numbers :Int): Int {
   var sum = 0

    //it will add all the numbers passed in varargs.
    numbers.forEach {n -> sum += n  }

    return sum
}

//to return two values
fun returnTwo(num : Int) : Pair<Int,Int> {
    return Pair(num+1,num+2)
}

fun returnThree(num : Int) :Triple<Int,Int,String>{
    return Triple(num+1,num+2,"Zafar")
}