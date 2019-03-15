package com.example.kotlin.Streams

import java.util.stream.Collectors
import java.util.stream.DoubleStream
import java.util.stream.IntStream
import kotlin.streams.asStream


fun main(args: Array<String>) {
    val stream = 1.rangeTo(10).asSequence().asStream()
    val resultantList = stream.skip(5).collect(Collectors.toList())
    println(resultantList)

    //IntStreams
    intStreams()
    println()

    //primitiveStreams
    primitiveStreams()
}

fun primitiveStreams() {
    val doubleStream = DoubleStream.iterate(1.5,{item -> item*1.3 })
    val avg = doubleStream.limit(10)
        .peek{
            println("Item : $it")
        }.average()

    println("Average of 10 items is $avg")


}

fun intStreams() {
    val intStream = IntStream.range(1,10)
    val sum = intStream.sum()
    println("Sum of 1... 10 is $sum")
    /*Here, IntStream.ragne() function takes two
    integers as the starting and ending point and creates a Stream ranging from the specified integers,
    with both included. We then calculated the sum and printed it.*/

    /*Think of calculating the sum of elements with that ease;
    without IntStream, we would have to loop through all the elements to calculate the sum.*/
}


