package com.example.kotlin.classes

class AlmondCupcake {
    val flavour = "Almond"
}

class BlueberryCupcake {
    val flavour = "Blueberry"
}
fun main(args: Array<String>) {
    val mySecondCupcake = AlmondCupcake()
    println("My second cupcake has ${mySecondCupcake.flavour} flavour")

    val flavour1 = Cupcake("Almond")
    val flavour2 = Cupcake("Blueberry")
    val flavour3 = Cupcake("Cheese")
    val flavour4 = Cupcake("Caramel")

    println("flavour1 ${flavour1.flavour} flavour2 ${flavour2.flavour} " +
            "flavour3 ${flavour3.flavour} flavour4 ${flavour4.flavour} ")
    println()
    println("Method call : ${flavour1.work()}")
}

class Cupcake(flavour : String){
    val flavour = flavour

    //create a method inside class
    fun work():String{
        return "Dedicate your time to your work, then you will be successful"
    }

    fun bake() : String{
        return "Bake"
    }

}