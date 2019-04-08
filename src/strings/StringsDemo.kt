package strings

fun main(args: Array<String>) {

    var str : String = " Hey! Lets Start Kotlin. "
    var str1 : String = " It is the best Language for mobile app development "

    var stringManipulation : String = str + str1
    println(stringManipulation)

    val token : List<String> = str.split(" ")
    for (string in token){
        println(string)
    }

}