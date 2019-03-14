package com.example.kotlin.functionalProgramming.first_class_function

interface Machine<T> {
    fun process(product: T)
}

fun <T> useMachine(t: T, machine: Machine<T>) {
    machine.process(t)
}

class PrintMachine<T> : Machine<T> {
    override fun process(t: T) {
        println(t)
    }
}

fun main(args: Array<String>) {
    useMachine(5, PrintMachine())
    useMachine(5, object : Machine<Int> {
        override fun process(t: Int) {
            println(t)
        }
    })
}

