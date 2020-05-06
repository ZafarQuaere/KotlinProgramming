package strings

fun main(args: Array<String>) {

    var str : String = " Hey! Lets Start Kotlin. "
    var str1 : String = " It is the best Language for mobile app development "

    var stringManipulation : String = str + str1
    println(stringManipulation)

    var phoneNO: String = "(+91)7834908329"
    println("Before : $phoneNO   After ${formatPhone(phoneNO)}")

 /*   val token : List<String> = str.split(" ")
    for (string in token){
        println(string)
    }*/

}

fun formatPhone(phoneNO: String): String {
    var formatted = phoneNO.replace("[^0-9]".toRegex(),"")
    println(formatted)
    return formatted
}
