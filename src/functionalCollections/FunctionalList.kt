package com.example.kotlin.functionalCollections

import com.example.kotlin.utility.executionTime
import kotlin.coroutines.EmptyCoroutineContext.fold

sealed class FunList<out List> {
    object Nil : FunList<Nothing>()

    data class Cons<out T>(val head: T, val tail: FunList<T>) : FunList<T>()

    fun main(args: Array<String>) {
        val numbers = Cons(1, Cons(2, Cons(3, Cons(4, Nil))))
        val funList = intListOf(1, 2, 3, 4)
        val list = listOf(1, 2, 3, 4)
      //  println("fold on FunList : ${executionTime { FunList.fold(0) { acc, i -> acc + i } }}")
        println("fold on list : ${executionTime { list.fold(0) { acc, i -> acc + i } }}")
    }

    fun reverse(): FunList<Any> = fold(Nil as FunList<Any>) { acc, i -> Cons(i, acc) }

    fun intListOf(vararg numbers: Int): FunList<Int> {
        return if (numbers.isEmpty()) {
            FunList.Nil
        } else {
            FunList.Cons(numbers.first(), intListOf(*numbers.drop(1).toTypedArray().toIntArray()))
        }
    }
}

