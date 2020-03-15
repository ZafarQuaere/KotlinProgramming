package loop_iterators

import com.example.kotlin.functionalCollections.numbers

fun main(args: Array<String>) {
    val names = listOf("Zafar", "Imam", "Sani")
    //simple for looop
    for (i in 1..10) {
        println("Index: $i")
    }

    for (name in names)
        println(name)

    println("============================================================")
    // for loop with steps
    // even number between 1 to 10
    for (i in 0..10 step 2)
        println("Index: $i")

    //for each loop
    names.forEach({println(it)})

    println("============================================================")
    // for loop with downTo
    for (i in 10 downTo 1 step 2)
        println("Index: $i")

    println("============================================================")
    // for loop with index and value
    for ((index, value) in names.withIndex())
        println("Index: $index value:  $value")
    
    for ((index) in names.withIndex())
        println("Index: $index ")

    forInMap()

    forInSet()
}

fun forInSet() {
    val sets = setOf<String>("a", "b", "c", "d")
    for (set in sets)
        println(set)

}

fun forInMap() {
    var map = mapOf(1 to "Zafar", 2 to "Imam", 3 to "Sani", 4 to "Sami")

    // Iterate over the entries as objects that contain the key and the value as properties
    for (entry in map) {
        println("${entry.key}: ${entry.value}")
    }

// Iterate over the entries as separate key and value objects
    for ((key, value) in map) {
        println("Key: $key   Value:  $value")
    }

// Iterate over the keys
    for (key in map.keys) {
        println(key)
    }

// Iterate over the values
    for (value in map.values) {
        println(value)
    }
}
