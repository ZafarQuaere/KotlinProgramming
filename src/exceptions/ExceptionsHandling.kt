package exceptions

import java.lang.NumberFormatException

fun main(args: Array<String>) {

    simpleTryCatch()

}

private fun simpleTryCatch() {
    var str: String = "4a"
    //here we can do try catch simple as in java but in kotlin
    /* var num : Int = 0
     try {
         num = str.toInt()
     } catch (e: NumberFormatException) {
         println("Enter the proper value")
     }*/

    // In Kotlin we can assign the value to num as an express as below, this will work same way as above
    var num = try {
        str.toInt()
    } catch (e: NumberFormatException) {
        -1
    }
    num++
    println(num)

}
