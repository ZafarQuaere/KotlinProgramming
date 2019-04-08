package files

import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    println("Select operation \n1.Read Operation \n2.Write Operation \n")
    val op = readLine()!!.toInt()
    when(op){
        1 -> {
            readDataFromFile()
        }
        2 -> {
            print("Enter string to write in file : ")
            val string = readLine()!!.toString()
            writeToFile(string)
        }
    }

}

fun writeToFile(string: String) {
    val fileName: FileWriter
    try {
        fileName = FileWriter("test.txt",true) // adding true means if file already exists then added the new thing to it.
        fileName.write(string+"\n")
        fileName.close()
    } catch (e: Exception) {
        println(e.message)
    }
}

fun readDataFromFile(){
    val file: FileReader
    try {
        file = FileReader("test.txt")
        var c : Int?
        do {
            c = file.read()
            print(c.toChar())
        }while (c != -1)

    } catch (e: Exception) {
        println(e.message)
    }

}
