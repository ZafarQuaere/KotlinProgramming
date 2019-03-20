package com.example.kotlin.Enums

fun main(args: Array<String>) {

    val flourDescription = flourDescription(Flour.CORN)
    println("Flavours selected : $flourDescription")
}
fun flourDescription(flour: Flour): String{
    return when(flour){
        Flour.CASSAVA -> "A very exotic flavour"
        /*Flour.CORN -> "A Corn Flavour"*/
        Flour.WHEAT -> "Wheat Flavour"

        else -> "No Flavour "
    }
}