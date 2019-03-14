package com.example.kotlin.ReactiveProgramming

import android.annotation.SuppressLint
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toObservable

@SuppressLint("CheckResult")
fun main(args: Array<String>) {
    var list : List<Any> = listOf(1,"Two",3,"Four","Five",5.5f) //1
    var iterator = list.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }

    println()
    println()

    var observable = list.toObservable() //observalbe instance created by list.

    /*As we subscribe to the observable variable, each data will be pushed to onNext as it gets ready; it'll
    call onComplete when all the data is pushed, and onError if any error occurs.*/

    observable.subscribeBy( // named arguments for lambda Subscribers
            onNext = { println(it)},
            onError = { it.printStackTrace()},
            onComplete = { println("Done !")}
    )

}