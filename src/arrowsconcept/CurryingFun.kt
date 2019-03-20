package com.example.kotlin.arrowsconcept

import arrow.syntax.function.curried
import arrow.syntax.function.pipe
import arrow.syntax.function.reverse
import arrow.syntax.function.uncurried

fun main(args: Array<String>) {

    /* Applying curried to a function of n parameters, for example, (A, B) -> R, transforms it into a chain of
     the n function calls, (A) -> (B) -> R:*/

    val strong: (String, String, String) -> String =
        { body, id, style -> "<strong id=\"$id\" style=\"$style\" body = $body />" }

    val curriedStrong: (style: String) -> (id: String) -> (body: String) -> String = strong.reverse().curried()

    val greenStrong: (id: String) -> (body: String) -> String = curriedStrong("color:green")

    val uncurriedGreenStrong: (id: String, body: String) -> String = greenStrong.uncurried()

    println(greenStrong("movie5")("Green Inferno"))
    println(uncurriedGreenStrong("movie6", "Green Hornet"))

    "Fried Green Tomatoes" pipe ("movie7" pipe greenStrong) pipe ::println

    // Functions on curried forms can be transformed into a normal, multi-parameter form with uncurried().

    //Differences between the currying and partial application

    differencePartialNCurried()
}

fun differencePartialNCurried() {
    val strong: (String, String, String) -> String =
        { body, id, style -> "<strong id=\"$id\" style=\"$style\" body = $body />" }

    println(strong.curried()("Batman Begins")("trilogy1")("color:black")) // Curried
   // println(strong("The Dark Knight")("trilogy2")("color:black")) // Fake curried, just partial application //compile error
   // println(strong(p2 = "trilogy3")(p2 = "color:black")("The Dark Knight rises")) // partial application //compile error
}
