package com.example.kotlin.DelegationInKotlin

/*
You have an interface, I, and two classes, A and B. Both A and B implement I. In your code, you've
an instance of A and you want to create an instance of B from that A.
In traditional inheritance, it is not directly possible; you have to write a bunch of nasty codes to
achieve that, but class delegation is there to save you.*/

interface Person{
    fun printName()
}

class PersonImp(val name: String) : Person{
    override fun printName() {
        println(name)
    }
}

class User(val person: Person) : Person by person{
    override fun printName() {
        println("Printing name....")
        person.printName()
    }
}

fun main(args: Array<String>) {
    val person = PersonImp("Class Delegation")
    person.printName()
    println()
    val user = User(person)
    user.printName()

}