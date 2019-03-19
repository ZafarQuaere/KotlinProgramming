package com.example.kotlin.arrowsconcept

//with partial application, we create a new function by passing a parameter to an existing function.
//Arrow comes with two flavours of partial application—explicit and implicit.

import arrow.syntax.function.bind
import arrow.syntax.function.invoke
import arrow.syntax.function.partially3
import arrow.syntax.function.reverse

fun main(args: Array<String>) {
    val strong: (String, String, String) -> String =
        { body, id, style -> "<strong id=\"$id\" style=\"$style\" body = $body />" }

    val redStrong: (String, String) -> String = strong.partially3("font: red") //Explicit
    val blueStrong: (String, String) -> String = strong(p3 = "font: blue") //Implicit

    println(redStrong("Red Sonja", "movie1"))
    println(blueStrong("Deep Blue Sea", "movie2"))


    /*A special case of partial application is binding. With binding, you pass a T parameter to the (T) -> R
    function but without executing it, effectively returning an () -> R function*/

    val footer : (String) -> String = { content -> "<footer> $content</footer>"}
    val fixFooter : () -> String = footer.bind("Functional Kotlin 2019 ")//alias for partially1
    println(fixFooter())
    println()
    reverseFun(redStrong)

}

fun reverseFun(redStrong: (String, String) -> String) {
    /* Reverse
    Reverse takes any function and returns it with its parameter in the reverse order (in other
    languages, this function is known as flip). Let's look at the following code:*/
    println(redStrong("Red Sonja", "movie1"))
    println(redStrong.reverse()("movie2", "The Hunt for Red October"))
}


