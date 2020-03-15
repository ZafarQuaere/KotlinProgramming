package com.example.kotlin.collections

import java.util.*

fun main(args: Array<String>) {

    simpleMaps()

    mutableMaps()

    javaTypeMap()

}

fun javaTypeMap() {
    var aliens = TreeMap<Int,String>()
    aliens[0] = "Zafar"
    aliens[1] = "Imam"
    aliens[2] = "Sami"

    for ((index,value) in aliens)
        println(" index : $index  Value: $value")
}

fun mutableMaps() {
    val mutableMap = mutableMapOf<Int, String>()
    mutableMap.put(1, "Item 1")
    mutableMap.put(2, "Item 2")
    mutableMap.put(3, "Item 3")
    mutableMap.put(4, "Item 4")

    println("Replacing value at key 1 - ${mutableMap.put(1, "Item 5")}")//(3)
    println("Contents in mutableMap")
    for ((entry,value) in mutableMap) {
        println("Key ${entry}, Value ${value}")
    }

}

fun simpleMaps() {
    val maps = mapOf(
        "One".to(1),
        "Two".to(2),
        "Three".to(3),
        "Four".to(4),
        "Five".to(0),//(1) We placed 0 instead of 5 here, will be replaced later
        "Six".to(6),
        "Five".to(5)//(2) This will replace earlier map of "Five".to(0))
    )

    println("The value at key 'Four' is ${maps["Four"]}")

    println("Contents in map ")
    for (entry in maps) {
        println("Key : ${entry.key} Value : ${entry.value}")
    }

}
