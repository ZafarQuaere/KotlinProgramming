package com.example.kotlin.arrow

import arrow.syntax.function.andThen
import arrow.syntax.function.compose
import arrow.syntax.function.forwardCompose
import java.util.*
import kotlin.random.Random



//Function Composition
val p: (String) -> String = { body -> "<p>$body</p>" }
val span: (String) -> String = { body -> "<span>$body</span>" }
val div: (String) -> String = { body -> "<div>$body</div>" }
val randomNames: () -> String = {
    if (Random.nextInt() % 2 == 0) {
        "foo"
    } else {
        "bar"
    }
}
fun main(args: Array<String>) {
    val divStrong: (String) -> String = div compose span
    val spanP: (String) -> String = p forwardCompose span
    val randomStrong: () -> String = randomNames andThen span
    println(divStrong("Hello composition world!"))
    println(spanP("Hello composition world!"))
    println(randomStrong())

    //With function composition, we take two functions to create the third function;
}

