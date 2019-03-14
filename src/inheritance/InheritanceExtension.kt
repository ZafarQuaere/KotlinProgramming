package com.example.kotlin.inheritance

//inheritance with extension functions
open class Feline

fun Feline.speak()= "<generic Feline Noise>"

class MyCat:Feline()

fun MyCat.speak()= "!Meoww"

fun printSpeak(feline: Feline){
    println(feline.speak())
}

fun main(args: Array<String>) {
    printSpeak(MyCat())
    printSpeak(Feline())

    println()
    println(Feline().speak())
    println(MyCat().speak())
}
