package com.example.kotlin.inheritance

open class Caregiver(val name: String) {

    open fun Feline.react() = "PURRRR!!!" //extension function of Feline class

    fun Primate.react() = "*$name plays with ${this@Caregiver.name}*" //extension function of Feline class

    fun takeCare(feline: Feline) {
        println("Feline reacts: ${feline.react()}")
    }

    fun takeCare(primate: Primate) {
        println("Primate reacts: ${primate.react()}")
    }
    /* fun takeCare(vet: Vet){
         println("Primate reacts: ${vet.react()}")
     }*/

}

fun main(args: Array<String>) {
    val careGiver = Caregiver("CareGiverExtensn")

    val myCat = MyCat()
    val primate = Primate("PrimateKoko")
    careGiver.takeCare(myCat)
    careGiver.takeCare(primate)

    val vet = Vet("Vettt")
    println()
    println()
    listOf(careGiver, vet).forEach { caregiver ->
        println("${caregiver.javaClass.simpleName} ${caregiver.name}")
        caregiver.takeCare(myCat)
        caregiver.takeCare(primate)
    }
}

open class Vet(name: String) : Caregiver(name) {
    override fun Feline.react() = "*runs away from $name*"
}

class Dispatcher {
    val dispatcher: Dispatcher = this

    fun Int.extension() {
        val receiver: Int = this
        val dispatcher: Dispatcher = this@Dispatcher
    }
}

