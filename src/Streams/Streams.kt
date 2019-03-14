package com.example.kotlin.Streams

import java.util.stream.Collectors
import kotlin.streams.asStream


fun main(args: Array<String>) {
    val stream = 1.rangeTo(10).asSequence().asStream()
    val resultantList = stream.skip(5).collect(Collectors.toList())
    println(resultantList)
}