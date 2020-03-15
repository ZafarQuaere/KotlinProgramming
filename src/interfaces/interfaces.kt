package interfaces

interface  A{
    fun show()
    fun abc(){
        println("abc of A")
    }
}

interface B{
    fun display()
    fun abc(){
        println("abc of B")
    }
}

class C : A,B{

    override fun show() {
        println("show() ")
    }

    override fun display() {
        println("display ()")
    }

    override fun abc() {
        println("abc of C") // here it will print abc of C
        //if i want to print abc() of B then
        super<B>.abc()
        //if i want to print abc of A then
        super<A>.abc()
    }
}
fun main (string: Array<String>){
    var obj = C()
    obj.display()
    obj.show()
    obj.abc()
}