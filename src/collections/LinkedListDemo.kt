package collections

import java.util.*

fun main(args: Array<String>) {
    var listOfCity = LinkedList<String>()
    do {
        print("Please enter cityname or exit to quit")
        var cityName : String = readLine()!!.toString()
        if (cityName!="quit") {
            listOfCity.add(cityName)
        }
    }while (cityName!="quit")


    println("Cities are using index")
    for (i in 0 until listOfCity.size) {
        println("City $i : ${listOfCity[i]}")
    }

    println("Cities are using object")
    for (city in listOfCity){
        println("City : $city")
    }

}