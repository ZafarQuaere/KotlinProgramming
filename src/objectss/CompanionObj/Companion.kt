package com.example.kotlin.Objects.CompanionObj

import com.example.kotlin.classes.abstract_class.BakerGood
import com.example.kotlin.interfaces.Bakeable


class Cupcake(flavour: String) : BakerGood(flavour), Bakeable {
    override fun bake(): Any? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun name(): String {
        return "cupcake"
    }
    //an object inside a class or interface is called..
    companion object {
        fun almond(): Cupcake {
            return Cupcake("almond")
        }
        fun cheese(): Cupcake {
            return Cupcake("cheese")
        }
    }
}