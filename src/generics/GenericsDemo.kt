package generics

class GenericsDemo<T>(genericType : T){
    init {
        println("Generic Type is : $genericType")
    }
}

fun main(args: Array<String>) {
    val type1 = GenericsDemo<String>("Kotlin")
    val type2 = GenericsDemo<Int>(2017)
    val type3 = GenericsDemo<Double>(2017.65)
}