package com.example.kotlin.operatorOverloading

/*
Kotlin lets you define the behavior of operators on your own or existing types with functions,
normal or extension, marked with the modifier operator
 */
class Wolf(var name : String){
    operator fun plus(wolf: Wolf) = Pack(mapOf(name to this,wolf.name to wolf))
}

class Pack(val members : Map<String,Wolf>)

class Alien{
    var skills = ""
    fun show(){
        println(skills)
    }
}

fun main(args: Array<String>) {
  // example1()
    example2()

}

fun example2() {
    var a1 = Alien()
    a1.skills = "Java"
    a1.show()

    var a2 = Alien()
    a2.skills = "Kotlin"
    a2.show()

    //var a3 = a1 plus a2 // it was only infix and extension function
    var a3 = a1 + a2 // it calling operator overloading function by adding operator keyword in the function.
    a3.show();

}

private infix operator fun Alien.plus(a2: Alien): Alien {
    var a3 = Alien()
    a3.skills = this.skills +" "+a2.skills
    return a3
}

private fun example1() {
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