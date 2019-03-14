package com.example.kotlin.inheritance

open class Canine{
    open fun speak() = "<generic canine noise>"
}

class Dog : Canine(){
    override fun speak() = "Woof !!"
}
class Cat : Canine(){

}
fun printSpeak(canine: Canine){
    println(canine.speak())
}

fun main(args: Array<String>) {
    printSpeak(Canine())
    printSpeak(Dog())
    printSpeak(Cat())

}