package com.example.kotlin.operatorOverloading

/*
Kotlin lets you define the behavior of operators on your own or existing types with functions,
normal or extension, marked with the modifier operator
 */
class Wolf(var name : String){
    operator fun plus(wolf: Wolf) = Pack(mapOf(name to this,wolf.name to wolf))
}

class Pack(val members : Map<String,Wolf>)

fun main(args: Array<String>) {
    val wolfObj = Wolf("Kotlin")
    val packObj:Pack = wolfObj + Wolf("Coding") //wolfObj.plus(Wolf(...))

    println("Operator Overloading : ${packObj}")

    operator fun Pack.plus(wolf: Wolf) = Pack(this.members.toMutableMap() + (wolf.name to wolf))
    var biggerPack = packObj + Wolf("Bad Wolf")

}

/*
The operator function plus returns a pack value. To myFun it, you can use the infix operator way
(Wolf + wolf) or the normal way (Wolf.plus(Wolf)).
 */