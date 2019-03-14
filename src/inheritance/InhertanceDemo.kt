package com.example.kotlin.inheritance


open class BakeryGood(val flavour: String) {
    fun eat(): String {
        return "nom, nom, nom... delicious $flavour ${name()}"
    }
    open fun name(): String {
        return "bakery good"
    }
}
class Cupcake(flavour: String): BakeryGood(flavour) {
    override fun name(): String {
        return "cupcake"
    }
}
class Biscuit(flavour: String): BakeryGood(flavour) {
    override fun name(): String {
        return "biscuit"
    }
}