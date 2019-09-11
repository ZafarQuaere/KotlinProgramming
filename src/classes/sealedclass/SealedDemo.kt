package classes.sealedclass

sealed class SealedDemo

data class FloatVal(val number : Float) : SealedDemo()

data class Sum(val value1: SealedDemo, val value2: SealedDemo) : SealedDemo()
data class Sub(val value1: SealedDemo, val value2: SealedDemo) : SealedDemo()

object NumVal : SealedDemo()


fun evaluate(sealedType: SealedDemo): Float = when (sealedType) {
    is FloatVal -> sealedType.number
    is Sum -> evaluate(sealedType.value1) + evaluate(sealedType.value2)
    is Sub -> evaluate(sealedType.value2) - evaluate(sealedType.value1)
    NumVal -> Float.NaN
}


fun main(args : Array<String>){
    val v1 = FloatVal(101F)
    val v2 = FloatVal(99F)

    val sum = Sum(v1,v2)
    val sub = Sub(v1,v2)

    println("Evaluate Sum ${evaluate(sum)}")
    println("Evaluate Sub ${evaluate(sub)}")
}