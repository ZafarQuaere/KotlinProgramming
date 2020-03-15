package constructor

class ConstructorDemo(str: String = "Imam") {

    var name = str
    var age = 0
    //secondary constructor
    constructor(age: Int, name : String) : this(name){ // it is mandatory to call primary constructor using this from any other constructor
        this.age = age
    }
    fun show() {
        println("Constructor Demo $name $age")
    }
}

fun main(string : Array<String>){
//    var demo = ConstructorDemo("Zafar")
    var demo = ConstructorDemo()
    var demo1 = ConstructorDemo(name = "zafar",age =30)
    demo.show()
    demo1.show()
}