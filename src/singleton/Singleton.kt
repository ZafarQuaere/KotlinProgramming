package singleton

class Singleton{
    var name: String?=null
    private constructor(){
        println("instance is created ")
    }

    companion object {
        val instance : Singleton by lazy { Singleton() }
    }
}

fun main(args: Array<String>) {
    val inst1 = Singleton.instance
    inst1.name = "Kotlin"

    println(inst1.name)

    val inst2 = Singleton.instance
    println(inst2.name)

    val inst3 = Singleton.instance
    println(inst3.name)
}