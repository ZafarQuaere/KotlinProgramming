package classes

 data class Laptop(var name: String,var price: Int){

     fun show(){
         println("Kotlin is awesome ")
     }
}

fun main(string : Array<String>){

    var obj1 = Laptop("Dell",2000)
    var obj2 = Laptop("Lenovo",2000)

    //You can copy or clone the data class object, but you can't copy the object of any other class
    var obj3 = obj1.copy(name ="HP")
    println(obj1 == obj2)
    println(obj3)

}