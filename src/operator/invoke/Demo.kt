package com.example.kotlin.operator.invoke

import com.example.kotlin.operatorOverloading.Pack

/** A function that takes 1 argument. */

public interface Function1<in P1, out R> : Function<R> {
    /** Invokes the function with the specified argument. */
    public operator fun invoke(p1: P1): R
}

enum class WolfActions{
    SLEEP,WALK,BITE
}

class Wolf(val name : String){
  operator  fun invoke(action : WolfActions) = when(action){
        WolfActions.SLEEP -> "$name is sleeping"
        WolfActions.WALK -> "$name is walking"
        WolfActions.BITE -> "$name is biting"
    }

    operator fun invoke(){
        println("Invoke() is called ")
    }

    operator fun invoke(int: Int){ //invoke methods can be called only by instance, no need to call by name such as obj(5) will call this method


    }

    fun m1(){

    }
}

/*
Operator                Equivalent
x[y]                    x.get(y)
x[y1, y2]               x.get(y1, y2)
x[y1, y2..., yN]        x.get(y1, y2..., yN)*/


fun main(args: Array<String>) {
    val talbot = Wolf("Wolf ")
   // talbot.invoke(WolfActions.SLEEP) // talbot.myFun(WolfActions.SLEEP)
    println("WolfActions.BITE = ${talbot(WolfActions.BITE)}")
    println("WolfActions.BITE = ${talbot.invoke(WolfActions.SLEEP)}")
    talbot()
    operator fun Pack.get(name: String) = members[name]!!

    // val badWolf = biggerPack["Bad Wolf"]
    // talbot[WolfRelationships.ENEMY] = badWolf

    println("!talbot : ${!talbot}" )// talbot.not())
    println("talbot.not() : ${talbot.not()}" )// talbot.not())
    println("joinWithPipe $joinWithPipe")
    println("html $html")
}
operator fun Wolf.not() = "$name is angry!!!"

enum class WolfRelationships {
    FRIEND, SIBLING, ENEMY, PARTNER
}
operator fun Wolf.set(relationship: WolfRelationships, wolf: Wolf) {
    println("${wolf.name} is my new $relationship")
}

val joinWithPipe = with(listOf("One", "Two", "Three")){
    joinToString(separator = "|")
}


val html = buildString {
    append("<html>\n")
    append("\t<body>\n")
    append("\t\t<ul>\n")
    listOf(1, 2, 3).forEach { i ->
        append("\t\t\t<li>$i</li>\n")
    }
    append("\t\t<ul>\n")
    append("\t</body>\n")
    append("</html>")
}

val myString = buildString{append("Zafar")
    append("imam")
}
