package recursion

import java.math.BigInteger

fun main(args: Array<String>){
//    simpleFactorial()
    simpleRecursion()
//    usingBigInteger()
}

fun usingBigInteger() {

//    var num = BigInteger("70")
//    var num = 70.toBigInteger()
//    var fact = bigFactorial(num)
//    println(fact)
}

//fun bigFactorial(num: BigInteger): BigInteger {
//
//    if (num == 0.toBigInteger())
//        return 1.toBigInteger()
//    else
//        return num * bigFactorial(num - 1.toBigInteger())
//}

fun simpleRecursion() {
    var num = 5
    var factorial = factorial(num)
    println("Factorial is : $factorial")
}

fun factorial(num: Int) : Int{
    if (num == 0)
        return 1
    else
        return num * factorial(num -1)

}

private fun simpleFactorial() {
    // let's check the factorial of 5
    var num = 5
    var fact = 1
    for (i in 1..num){
        //fact = i * fact
        fact *= i
    }

    println("Factorial : $fact")
}
