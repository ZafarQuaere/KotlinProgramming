package com.example.kotlin.Objects

data class Book(var name : String, var price : Int)

//object is used to create a singleton class
object BookShelf{
    var bookSelves = arrayListOf<Book>()

    fun showBooks(){
        for (i in bookSelves){
            println(i)
        }
    }
}

fun main(args: Array<String>) {
    BookShelf.bookSelves.add(Book("Java", 50))
    BookShelf.bookSelves.add(Book("Sql", 30))
    BookShelf.bookSelves.add(Book("Kotlin", 70))
    BookShelf.showBooks()
}