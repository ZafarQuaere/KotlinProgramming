package com.example.kotlin.MonadFunctorsApplicatives

/*fun main(args: Array<String>) {
    listOf(1,2,3)
            .map { i -> i *2 }
           // .map { it * 2 }
            .map (Int :: toString )
            .forEach {::println }
}*/
/*A functor is a type that defines a way to transform or to map its content. You
can find different definitions of a functor, more or less academic; but in principle, all point to the
same direction.*/
fun main(args: Array<String>) {
    listOf(1, 2, 3)
            .map {it * 2 }
            .map(Int::toString)
            .forEach(::println)

    println(Option.Some("Kotlin")
            .map(String::toUpperCase)) //Some(value=KOTLIN)
    println(Option.None.
            map(String::toUpperCase)) //None


   /* val add3AndMultiplyBy2: (Int) -> Int = { i: Int -> i + 3 }.map { j -> j * 2 }
    println(add3AndMultiplyBy2(0)) //6
    println(add3AndMultiplyBy2(1)) //8
    println(add3AndMultiplyBy2(2)) //10*/
}

sealed class Option<out T>{
    object None : Option<Nothing>(){
        override fun toString() = "None"
    }

    data class Some<out  T>(val value: T) : Option<T>()

    companion object
}

fun <T,R> Option<T>.map(transform : (T) -> R) : Option<R> = when(this){
    Option.None -> Option.None
    is Option.Some -> Option.Some(transform(value))
}
