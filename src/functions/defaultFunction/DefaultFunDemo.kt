package com.example.kotlin.functions.defaultFunction

fun main(args: Array<String>) {
    val volume = findVolume(2, 5)
    println("Volume = $volume")

    val volume1 = findVolume(2, 5,0)
    println("Volume1 = $volume1")

    println("5>0: ${5.isGreaterThan()}")
    println("5>6: ${5.isGreaterThan(6)}")
    var a = 2
    println(someMethod(a, {println("Just some dummy function")}))

}

fun findVolume(length: Int, breadth: Int,height : Int = 10) : Int{

    return length*breadth*height
}


fun Int.isGreaterThan(anotherNumber:Int = 0):Boolean {
    return this>anotherNumber
}

fun someMethod(a: Int, func: () -> Unit):Int {
    func()
    return 2*a
}