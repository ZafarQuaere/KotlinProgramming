package com.example.kotlin.collections

import kotlin.math.roundToInt
import kotlin.math.sqrt


/*
The map function allows you to apply an algorithm to a collection all-together and obtain the
results as a resultant set.*/

fun main(args: Array<String>) {
    //1 Map Function
    mapFunction()
    println()

    //2 filterFunction
    filterFunction()
    println()

    //3 The flatMap function
    flatMapFun();
    println()

    //4 The drop functions
    //dropFunction()
    println()

    //5 The take functions
    // takeFunction()
    println()

    //6 The zip function
    zipFunctions()
    println()

    //Grouping Collections
    groupingCollections()
}

fun groupingCollections() {
    /*if you have a list of strings and want to group them with respect to their size, you can
    easily do that with the help of the groupBy function*/
    val list = 1.rangeTo(50).toList()
    println("{list.groupBy { it%5 }}  ${list.groupBy {it%5}}") //it will print remaining of 5 grouped by 1,2,3,4,0
    println("{list.groupBy { it%5 }}  ${list.groupBy {it%2 == 0}}") //it will print value true and false as per the condition

}

fun mapFunction() {
    val list = listOf<Int>(1,2,3,4,5,6)
    val modifiedList = list.map { it*2 } // it will iterate all the values from list and multiply with 2
    val modifiedList1 = list.map { it+5 } // it will iterate all the values from list and add 5 with it

    //println("modified List -> $modifiedList")
    //println("modified List -> $modifiedList1")

}

//The zip function
fun zipFunctions() {
    /*The zip function does exactly what it sounds like, it zips collections. Confusing? Let's have a look
    at the following example:*/
    val list1 = listOf(1,2,3,4,5) //list of int
    val list2 = listOf( //list of string
            "Item 1",
            "Item 2",
            "Item 3",
            "Item 4",
            "Item 5"
    )

    val resultantList = list1.zip(list2)
    println("Zip resultantList -> $resultantList")
    zip2()

}

fun zip2() {

    val list1 = listOf(1,2,3,4,5,6,7,8)
    val list2 = listOf(
            "Item 1",
            "Item 2",
            "Item 3",
            "Item 4",
            "Item 5"
    )
    println("list1.zip(list2)-> ${list1.zip(list2)}")
    println("list1.zipWithNext() -> ${list1.zipWithNext()}")
}

//The take functions
fun takeFunction() {
   /* The take functions work in just the opposite way to the drop functions. You can take a selection from
            the collection and ignore the rest.*/

    val list = 1.until(50).toList()
    println("list.take(25) -> ${list.take(15)}")
    println("list.takeWhile { it <= 10 }} ${list.takeWhile { it <= 10 }}")
    println("{list.takeWhile { it >= 40 }} ${list.takeLastWhile { it >= 40}}")
    println("{list.takeLast(5) } ${list.takeLast(5) }")

}

//The drop functions
fun dropFunction() {
   /* There may be some scenarios when you want to drop a portion (say, the first 5 or the last 10) of the
    collection and work on the remaining parts.*/

    val list = 1.until(50).toList()
    println("Drop 30 -> ${list.drop(30)}") //this will print numbers above 30
    println("list.dropLast(25) -> ${list.dropLast(25)}")//(2)

}

//The flatMap function
fun flatMapFun() {
   /* Like the map function, it receives each of the items in the collection as an iteration, but, unlike the map
    function, it should return another collection for each of the items passed. These returned collections
    are then combined to create the resultant collection.*/
    val list = listOf(10,20,30)
    val list1 = listOf(1,2,3)

    val flatMappedList = list.flatMap {
        it.rangeTo(it+4)
    }

    val flatMappedList1 = list1.flatMap {
        it.rangeTo(it+2)
    }


    println("flatMappedList -> $flatMappedList")
    println("flatMappedList1 -> $flatMappedList1")

}

//The filter function
fun filterFunction() {
    /*when you want to obtain only even numbers from a list of integers. The filter function is there to help you in these
    scenarios.*/

    val list = 1.until(50).toList() //1
    val filteredListEven = list.filter { it%2 == 0 } //2

    println("Filtered List Even -> $filteredListEven")

    val filteredListPSquare = list.filter {
        val squareRoot = sqrt(it.toDouble()).roundToInt()
        squareRoot*squareRoot == it
    }//3

    println("Filtered squareRoot -> $filteredListPSquare")
    println("Square root of 9 : ${sqrt(9.toDouble()).roundToInt()}")

}

