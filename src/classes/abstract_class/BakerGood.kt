package com.example.kotlin.classes.abstract_class

abstract class BakerGood(val flavour: String) {
    fun eat(): String {
        return "nom, nom, nom... delicious $flavour ${name()}"
    }
    abstract fun name(): String
}

 class Customer(val name: String) {
    fun eats(food: BakerGood) {
        println("$name is eating... ${food.eat()}")
    }
}
open class Donut(flav1 : String, flav2:String, name: String) : BakerGood("flavour") {

    override fun name(): String {
        return "Donut"
    }

}
fun main(args: Array<String>) {
    val mario = Customer("Mario")
   //val myDonut = Donut("Mario","Capachio")
  //  mario.eats(myDonut)

    mario.eats(object : BakerGood("TEST_1") {
        override fun name(): String {
            return "TEST_2"
        }
    })

    println()
    println()
    val food: BakerGood = object : BakerGood("TEST_1") {
        override fun name(): String {
            return "TEST_2"
        }
    }
    mario.eats(food)
}