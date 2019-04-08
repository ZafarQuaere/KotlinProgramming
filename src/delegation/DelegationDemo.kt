package delegation

interface CreditCard {
    fun score(age: Int)
    val cardNumber: String
}

class MasterCard(override val cardNumber: String) : CreditCard {
    override fun score(age: Int) {
       if (age > 50 ){
           println("MaterCard Negative")
       }else{
           println("MaterCard Positive")
       }
    }

    fun print(){
        print("Hello Mr.")
    }
}

class  Visa(override val cardNumber: String) : CreditCard{
    override fun score(age: Int) {
        if (age > 60 ){
            println("Visa Negative")
        }else{
            println("Visa Positive")
        }
    }

}

//It is the delegation class
class Paypal (client : CreditCard) : CreditCard by client{

    fun printPaypal(){
        println(this.cardNumber)
    }
}

fun main() {
    val visa = Visa("11223344566")
    visa.score(60)

    val masterCard = MasterCard("665544332211")
    masterCard.score(60)

    val paypal = Paypal(masterCard)
    println("Paypal CardNumber is : ${paypal.cardNumber}")
    paypal.printPaypal()

    val paypal1 = Paypal(visa)
    println("Paypal CardNumber is : ${paypal1.cardNumber}")
}