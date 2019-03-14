package com.example.kotlin.inheritance

open class Primate(val name:String)

fun Primate.speak() = "$name: <generic primate noise>"

open class GiantApe(name: String) : Primate(name)

fun GiantApe.speak() = "${this.name} :<scary 100db roar>"

fun printSpeak(primate: Primate){
    println(primate.speak())
}

fun main(args: Array<String>) {
    printSpeak(GiantApe("GiantApe"))
    printSpeak(Primate("Primate"))

    println()
    println(Primate("Primate").speak())
    println(GiantApe("GiantApe").speak())
}