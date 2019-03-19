package com.example.kotlin.Streams

import java.util.stream.Collectors
import java.util.stream.Stream
import kotlin.streams.asStream

fun main(args: Array<String>) {
    val resultant = (0..10)
        .asSequence()
        .asStream()
        .collect(Collectors.toCollection { LinkedHashSet<Int>() })
    println("Resultant List : $resultant")
    println()
    //Collecting into Map – Collectors.toMap()
    collectingIntoMap()
    println()

    //Joining Stream of strings –
    //Collectors.joining()
    collectorsJoining()
    println()

    //Grouping elements of Stream –
    //Collectors.groupingBy()
    collectorsGroupingBy()

}

fun collectorsGroupingBy() {
    //This function lets us collect the elements of a Stream into a Map function while grouping them
    val resultantGroupByList = (0..20).asSequence().asStream()
        .collect(Collectors.groupingBy<Int, Int> {
            it % 5
        })
    println("Group By List : $resultantGroupByList")
}

fun collectorsJoining() {
    //The Collectors.joining() function helps you join elements of a Stream, containing strings. It has three
    //optional parameters, namely—delimiter, prefix, and postfix
    val resultantString = Stream.builder<String>()
        .add("Item 1")
        .add("Item 2")
        .add("Item 3")
        .add("Item 4")
        .add("Item 5")
        .add("Item 6")
        .build()
        .collect(Collectors.joining("# ", " prefix ", " postfix "))
    println("Resultant String : $resultantString")
}

fun collectingIntoMap() {
    // The Collectors.toMap() function helps us repackage the Stream into Map implementation
    /* This function offers a lot of customizations. The simplest version accepts two lambdas; the first one is to
     determine the key of Map Entry, and the second lambda is to determine the value of Map Entry.
     Please note, each element in the Stream will be represented in an entry in the Map.*/

    val resultantMap = (0..10).asSequence().asStream()
        .collect(Collectors.toMap<Int, Int, Int>({
            it
        }, {
            it * it
        }))

    println("Resultant Map : $resultantMap")
}
