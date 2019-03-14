package com.example.kotlin.functions.pureFunctions

//Single expression function
fun substraction(a:Int,b: Int) : Int = a-b
//we can do more cut as
fun subs(a:Int,b: Int) = a-b

//VAR ARGS
fun varArgFun(vararg names:String){
    names.forEach(::println)
}
/*fun multipleVarargs(vararg names: String, vararg sizes: Int) {
// Compilation error, "Multiple vararg-parameters are prohibited"
}*/

fun <T, R> transforms(vararg ts: T, f: (T) -> R): List<R> = ts.map(f)

fun <T> emit(t: T, vararg listeners: (T) -> Unit) = listeners.forEach { listener ->
    listener(t)
}

fun main(args: Array<String>) {
    varArgFun()
    varArgFun("ABc","def","ghi","jkl")

    transforms(1, 2, 3, 4) { i -> i.toString() }

   // emit(1){i -> println(i)} //Compilation error. Passing value as a vararg is only allowed inside a parenthesized
    emit(1,::println,{ i-> println(i*2)})
}