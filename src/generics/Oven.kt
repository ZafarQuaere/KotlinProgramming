package com.example.kotlin.Generics

import com.example.kotlin.interfaces.Bakeable

interface Oven :Machine<Bakeable>{
    override fun process(product: Bakeable)
}

// Oven is machine so we can have it like..
interface Machine<T> {
    fun process(product: T)
}