package com.example.kotlin.DelegationInKotlin

import java.text.SimpleDateFormat
import java.util.*

private data class Book (val mapDelegate:Map<String,Any?>) {
    val name:String by mapDelegate
    val authors:String by mapDelegate
    val pageCount:Int by mapDelegate
    val publicationDate: Date by mapDelegate
    val publisher:String by mapDelegate
}

fun main(args: Array<String>) {
    val map1 = mapOf(
            Pair("name","Reactive Programming in Kotlin"),
            Pair("authors","Rivu Chakraborty"),
            Pair("pageCount",400),
            Pair("publicationDate",SimpleDateFormat("yyyy/mm/dd").parse("2017/12/05")),
            Pair("publisher","Packt")
    )
    val map2 = mapOf(
            "name" to "Kotlin Blueprints",
            "authors" to "Ashish Belagali, Hardik Trivedi, Akshay Chordiya",
            "pageCount" to 250,
            "publicationDate" to SimpleDateFormat("yyyy/mm/dd").parse("2017/12/05"),
            "publisher" to "Packt"
    )
    val book1 = Book(map1)
    val book2 = Book(map2)
    println("Book1 $book1 \n\nBook2 $book2")
}
/*
The program is simple enough; we defined a Book data class, and in the constructor, instead of
taking all member values one by one, we took a map and then delegated all to the map delegate.
One thing to be cautious here is to mention all member variables in the map, and the key name
should exactly match the property name.*/
