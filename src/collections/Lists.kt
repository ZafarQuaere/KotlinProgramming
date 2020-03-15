package com.example.kotlin.collections

fun main(args: Array<String>) {
    aboutImmutableList()
    //aboutMutableList()
}

fun aboutImmutableList() {
    val list = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for (i in list){
        print(" $i  ")
    }
    println()
    val evens = list.filter { it % 2 == 0 } // it will fetch all the even values
    evens.forEach { println(it) }
    println()
    val doubleValue = evens.map { it * 2 } // it will double the each values of even list
    doubleValue.forEach { println(it) }

    println()
    //create empty list
    val emptyList1 = listOf<Any>()
    val emptyList2 = emptyList<Any>()

    println("emptyList1.size = ${emptyList1.size}")
    println("emptyList2.size = ${emptyList2.size}")

    /*  we created empty lists, one with a listOf function with no arguments,
      another one is with an emptyList function. Please note that the listOf function, if called without any
      arguments, calls an emptyList function internally.*/

    val list1 = listOf(
            "1st Item",
            "2nd Item",
            "3rd Item",
            "4th Item",
            "5th Item"
    )


    println("3rd Item on the list :: ${list1.get(2)}")
    println("4rd Item on the list :: ${list1[3]}")
}

fun aboutMutableList() {

    val mutableList = mutableListOf(1,2,4)//1
    for (i in mutableList){
        println("for1 items $i  ")
    }
    println(".... Adding Items ....")
    mutableList.add(5)
    mutableList.add(2,3)
    mutableList.add(6)

    for (i in mutableList){
        println("for2 items $i")
    }

    mutableList.forEach {
        println(it)
    }

}
