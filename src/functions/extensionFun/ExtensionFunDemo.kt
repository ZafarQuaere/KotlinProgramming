package com.example.kotlin.functions.extensionFun

import java.util.regex.Pattern


//this is a general function which will count the words from of text
fun countWords(text : String):Int{
    return text.trim()
            .split(Pattern.compile("\\s+"))
            .size
}

// now we will create this method by using extension of String class which will perform the same task as follows

fun String.countWordsEx():Int{
    return trim()
            .split(Pattern.compile("\\s+"))
            .size
}
/*
Have a careful look at the function declaration. We declared the function as String.countWords(), not
just countWords as it was previously; that means it should be called on a String instance now, just like
the member functions of String class. Just like the following code:
 */

fun main(args: Array<String>) {
    val textCountByExtension = "This is an example StringnWith multiple words".countWordsEx()
    val textCountGeneral = countWords("This is an example StringnWith multiple words")
    println("countWordsEx :: $textCountByExtension")
    println("countWords :: $textCountGeneral")
    "Hello Kotlin(Extension function) called from main".sendToConsole()
}

fun String.sendToConsole(){
    println(this)
}