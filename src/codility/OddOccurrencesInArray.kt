package codility

import java.util.*

//find the unpaired element from array
fun main(args : Array<String>){

    println("Enter size of array:")
    var arraySize = readLine()!!.toInt()
    val array = Array<Int>(arraySize) { 0 }
    var index = 0
    if (arraySize %2 == 0){
        println("Enter any odd size ")
    } else {
        println("Enter the values of array:")
        while (index< arraySize){
            array[index] = readLine()!!.toInt()
            index++
        }
    }
    findTheUnPairedValue(array)
    println("Arrays : ${Arrays.toString(array)}")
}

fun findTheUnPairedValue(array: Array<Int>) {
    var count = 0
    var unmatchedValue = 0
   /* while (count < array.size){
        for (value in array.indices){
            if (array[count] == value){
                break
            } else {
                unmatchedValue = value
            }
        }
        count++
    }*/
    for ( (i,v) in array.withIndex()){
        for ((j,vv) in array.withIndex()){
           if (array[i] == array[j+1]){
               println("array-i : ${array[i]}   array-j ${array[j+1]}  are equals")
                break
            } else {
                unmatchedValue = array[i]
            }
        }
    }
    println("Unmatched value $unmatchedValue ")
}
