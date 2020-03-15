package files

import java.util.*

fun main(args: Array<String>){
    println("Enter any no: ")
    //read in java way
//    var input = Scanner(System.`in`).nextInt() // in is a keyword in kotlin, we can't use that direct, so we used it by applying (` backstick) prefix and postfix
//    println(input)

    // read in kotlin way
    var inputs = readLine()
    println(inputs)
}