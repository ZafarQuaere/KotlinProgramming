package codility

import java.util.*

fun main(arg: Array<String>) {
    val array1 = intArrayOf(1, 2, 3, 4, 5)
    println("Enter no of shift: ")
    val scanner = Scanner(System.`in`)
    val i: Int = scanner.nextInt()
    shiftArray(array1, i)
}

private fun shiftArray(array1: IntArray, i: Int) {
    var mainArray = array1
    println("Existing array: " + Arrays.toString(mainArray) + " Length: " + mainArray.size)
    var newArray = IntArray(mainArray.size)
    var no = 0;
    while (no < i) {
        for (j in mainArray.indices) {
            if (j == 0) {
                newArray[j] = mainArray[mainArray.size - 1]
            } else {
                newArray[j] = mainArray[j - 1]
            }
        }
        no++
        println("After Shifting array: " + Arrays.toString(newArray))
        mainArray = newArray
        newArray = IntArray(mainArray.size)
    }
}