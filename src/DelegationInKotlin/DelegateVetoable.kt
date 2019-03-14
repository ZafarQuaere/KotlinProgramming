package com.example.kotlin.DelegationInKotlin

import kotlin.properties.Delegates

/*
Delegates.vetoable is another standard mapDelegate that allows us to veto a value change.
This right to veto allows us to have a logic check on each assignment of the property, where we can decide
to continue with the assignment or not.
The following is an example:*/

var myIntEven : Int by Delegates.vetoable(4){
    property, oldValue, newValue ->
    println("${property.name} $oldValue -> $newValue")
    newValue%2==0
}
var myCounter:Int by Delegates.vetoable(0) {
    property, oldValue, newValue ->
    println("${property.name} $oldValue -> $newValue")
    newValue>oldValue
}

fun main(args: Array<String>) {
    myIntEven = 6
    myIntEven = 3
    println("myIntEven:$myIntEven")

    //mycounter() this will reject the value less than old one.. thzts vetoable
    myCounter = 2
    println("myCounter:$myCounter")
    myCounter = 5
    myCounter = 4
    println("myCounter:$myCounter")
    myCounter++
    myCounter--
    println("myCounter:$myCounter")
}