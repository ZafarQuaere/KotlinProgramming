package objectss.CompanionObj

class A {
    companion object {
        fun show() {
            println("Hey Kotlin .. Companion object")
        }
    }

    fun show() {
        println("Hey Kotlin .. using object")
    }
}

class B {
    // we can implement the factory pattern using companion object
    companion object {
        fun getInstance(): B = B()
    }

    fun display() {
        println("Display the kotlin call")
    }
}

fun main(string: Array<String>) {
    A.show() // companion objects member work as static member of class
    var a = A()
    a.show() // it is dynamic call to any member of class using object.

    var b = B.getInstance()
    b.display()

}