package com.example.kotlin.Streams

import java.util.stream.Collectors
import java.util.stream.Stream

fun main(args: Array<String>) {
    val stream = Stream.builder<String>() //The Stream.builder() method returns an instance of Streams.Builder
        .add("Item 1") //add function accepts an item for the stream value to be built, and returns the same instance of Stream.Builder.
        .add("Item 2")
        .add("Item 3")
        .add("Item 4")
        .add("Item 5")
        .add("Item 6")
        .add("Item 7")
        .add("Item 8")
        .add("Item 9")
        .add("Item 10")
        .build()

    println("The stream Collected is ${stream.collect(Collectors.toList())}")

    //Creating empty Streams –
    //Stream.empty()
    emptyStream()
    println()

    //Creating a Stream by passing elements –
    //Stream.of()
    streamOf()
    println()

    //Generating Streams –
    // Stream.generate()
    generateStreams()

}

fun generateStreams() {
    /*  We can also create a Stream by using the Stream.generate() factory method. It accepts a
      lambda/supplier instance as a parameter, and will use it to generate the item for each time the item
      is demanded. This method also creates an infinite Stream*/
    val stream = Stream.generate {
        //return a random number
        (1..20).random()
    }
    val resultantList = stream
        .limit(15)
        .collect(Collectors.toList())

    println("Resultant List is : $resultantList")

}

fun streamOf() {
    /*We can also get an instance of Stream by providing its elements to the of function. The of function
            works in a similar way to the Observable.just method from RxJava/RxKotlin.*/
    val stream = Stream.of("item 1", 2, "item 3", 4, 5.0, "item 6")
    println("Items in Stream is = ${stream.collect(Collectors.toList())}")

}

fun emptyStream() {

    val emptyStream = Stream.empty<String>()
    val item = emptyStream.findAny()
    println("Steam in item is : $item")

    /* Here, we created an emptyStream value with Stream.empty(), we then used
     the findAny() function to get hold of any element randomly selected from that Stream. The findAny()
     method returns an Optional value with a randomly selected item from the Stream, or an empty
     Optional, if the Stream is empty.*/
}
