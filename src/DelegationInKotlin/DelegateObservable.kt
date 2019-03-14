package com.example.kotlin.DelegationInKotlin

import kotlin.properties.Delegates

/*delegation enables the forwarding of getter and setter calls of a property to the mapDelegate.This enables delegates to
offer more cool features than just lately/lazily initialization.
        Think of a situation where you need to look
out for the value change of a property, and perform some action as soon as this occurs. The
immediate solution that comes to our mind is to override the setter, but this would look nasty and
make codes complex, whereas delegates are there to save our life.
        Have a look at the following example*/


var myStr:String by Delegates.observable("<Initial Value>") {
    property, oldValue, newValue ->
    println("Property ${property.name} changed value from $oldValue" +" to "+ "$newValue")
}
/*The Delegates.observable function takes two parameters to create the mapDelegate. The first argument is
the initial value of the property, and the second argument is the lambda that should be executed whenever the value change is noticed.*/

fun main(args: Array<String>) {
    myStr = "Change Value"
    myStr = "Change Value again"
}