package functionalProgramming


fun main(args: Array<String>) {

    var biggerNum = big(5, 8)
    println("Bigger number is $biggerNum")

    var add = add(5,9)
    println("Add number is $add")
}

private fun add(i: Int, i1: Int): Int = i + i1

private fun big(i: Int, i1: Int): Int = if (i > i1) i else i1
