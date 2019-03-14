package com.example.kotlin.variables

fun main(args: Array<String>){
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    println("Your Int Value is "+a);
    println("Your Double  Value is "+d);
    println("Your Float Value is "+f);
    println("Your Long Value is "+l);
    println("Your Short Value is $s");
    println("Your Byte Value is "+b);

    println("\n\nBiggest Int is "+Int.MAX_VALUE)
    println("Lowest Int is "+Int.MIN_VALUE)

    if (true is Boolean){
        println("true is Boolean")
    }

    //Type casting
    println("Double to Interger Conversion : "+ (3.14.toInt()))
    println("A to Interger  : "+ ('A'.toInt()))
    println("Integer to Char Conversion : "+ (68.toChar()))
}
