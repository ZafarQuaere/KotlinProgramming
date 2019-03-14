package com.example.kotlin.collections

data class MyDataClass (val someNumericValue:Int, val someStringValue:String)

class MyCustomClass (val someNumericValue:Int, val someStringValue:String) {
    override fun toString(): String {
        return "MyCustomClass(someNumericValue=$someNumericValue, someStringValue=$someStringValue)"
    }

    override fun hashCode() = someNumericValue.hashCode()+someStringValue.hashCode()
    override fun equals(other: Any?): Boolean {
        return other is MyCustomClass && other.someNumericValue == someNumericValue && other.someStringValue == someStringValue
    }
}

fun main(args: Array<String>) {
    //aboutMutable()
    setWithCustomClasses()
}

fun setWithCustomClasses() {

    val dataClassSet = setOf(
            MyDataClass(1,"1st obj"),
            MyDataClass(2,"2nd obj"),
            MyDataClass(3,"3rd obj"),
            MyDataClass(2,"2nd obj"),
            MyDataClass(4,"4th obj"),
            MyDataClass(5,"5th obj"),
            MyDataClass(2,"will be added"),
            MyDataClass(3,"3rd obj")
    )
    println("Printing items of dataClassSet one by one")
    for(item in dataClassSet) {
        println(item) //this will print all uniques values as DataClass already have a hashCode() and equals() function
    }
    val customClassSet = setOf(
            MyCustomClass(1,"1st obj"),
            MyCustomClass(2,"2nd obj"),
            MyCustomClass(3,"3rd obj"),
            MyCustomClass(2,"2nd obj"),
            MyCustomClass(4,"4th obj"),
            MyCustomClass(5,"5th obj"),
            MyCustomClass(5,"5th obj"),
            MyCustomClass(3,"3rd obj")
    )
    println("Printing items of customClassSet one by one")
    for(item in customClassSet) {
        println(item) //this will print duplicate values also as Custom class doesn't have a hashCode() and equals().
        //if we will add hashCode and equals() it will print only unique vaues.
        //after overriding hashCode() and equals() duplicate items will be removed.
    }
}

fun aboutMutable() {
    val set = mutableSetOf(1,2,3,3,4)
    println(" Set := $set")
    set.add(4)
    set.add(5)
    set.add(5)
    set.add(6)
    println("set := $set")

    for (i in set){
       // println()
    }
}
