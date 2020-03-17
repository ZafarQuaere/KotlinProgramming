package codility

/*
1) Enter any number
2) convert the number to binary number
3) find the maximum no of consecutive zero between two 1
4) return the maximum gap
 */
fun main(args: Array<String>) {
    println("Enter any number ")
    val no = readLine()!!.toInt()
    val binaryNo = convertNumericToBinary(no)
    println("Binary number :$binaryNo")
    findTheMaxGap(binaryNo)

}

fun findTheMaxGap(binaryNo: String) {
    var maxCount = 0
    var currentCount = 0
    val chars = binaryNo.toCharArray()
    for (char in chars) {
        if (char == '0') {
            currentCount++
        } else {
            if (maxCount < currentCount)
                maxCount = currentCount
            currentCount = 0
        }
    }
    println("max gap is : $maxCount")
}

fun convertNumericToBinary(i: Int): String {
    var a: Int
    var x = ""
    var n = i
    while (n > 0) {
        a = n % 2
        x = a.toString() + "" + x
        n /= 2
    }
    return x
}
