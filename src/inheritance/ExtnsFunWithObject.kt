package com.example.kotlin.inheritance

object Builder {

}

class Designer {

    companion object {

    }

    object Desk {

    }

}
fun Builder.buildBridge() = "A shiny new Bridge " //extnsn fun of Builder object

fun Designer.Companion.fastPrototype() = "Prototype " //extnsn fun for companion object

fun Designer.Desk.portfolio() = listOf<String>("Project1","Project2","Project3") //extnsn fun of an object of Desk class

fun main(args: Array<String>) {
    println("Builder.buildBridge() ${Builder.buildBridge()}")
    println("Designer.fastPrototype() ${Designer.fastPrototype()}")
    println("Designer.Desk.portfolio() ${Designer.Desk.portfolio().forEach (::println)}}")
}

