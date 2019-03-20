package com.example.kotlin.arrowsconcept

import arrow.syntax.function.pipe
import arrow.syntax.function.pipe3
import arrow.syntax.function.reverse

fun main(args: Array<String>) {
    //A pipe function takes a T value and invokes a (T) -> R function with it:
    val pipesVal : (String) -> String = {body -> "<strong>$body</strong>" }

    "From Pipe ".pipe(pipesVal).pipe(::println)


    val strong: (String, String, String) -> String =
        { body, id, style -> "<strong id=\"$id\" style=\"$style\"  body = $body />" }

    val redStrong: (String, String) -> String = "color: red" pipe3 strong.reverse()

    redStrong("movie3", "Three colors: Red") pipe ::println
}