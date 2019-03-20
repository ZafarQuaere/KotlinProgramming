package com.example.kotlin.MonadFunctorsApplicatives

fun main(args: Array<String>) {
    val result = listOf(1,2,3)
            .flatMap { i -> listOf(i*2, i+3) }
            .joinToString ()
    println(result)
}

fun <T, R> Option<T>.flatMap(fm: (T) -> Option<R>): Option<R> = when (this) {
    Option.None -> Option.None
    is Option.Some -> fm(value)
}