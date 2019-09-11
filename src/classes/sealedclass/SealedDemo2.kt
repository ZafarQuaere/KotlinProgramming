package classes.sealedclass

sealed class SealedDemo2 {
    class Refresh : SealedDemo2()
    class LoadMore : SealedDemo2()

}
fun main(args : Array<String>){
    val sealedDemo2 : SealedDemo2 = SealedDemo2.LoadMore()
    val output = when (sealedDemo2){
        is SealedDemo2.Refresh -> "Refresh"
        is SealedDemo2.LoadMore -> "Load More"
    }
    println("Output value : ${output}")
}
//Maybe you’re asking yourself: “Does the sealed classes have the same behavior as enum classes?” The answer is almost yes.

//A great way to explain sealed is comparing both. First, let’s create two simple classes:

//Enum
enum class Direction{
    TOP,LEFT,RIGHT,BOTTOM
}

//Sealed
sealed class Intention{
    object None : Intention()
    object Referesh : Intention()
    data class Error(val myValue : String) : Intention()
    data class LoadContent (val list : List<String>) : Intention();

}

//Both have the same behavior as an abstract class, preventing directly instantiation and allowing us to declare abstract methods:
// Enum
enum class Directions {
    TOP {
        override fun direction(x: Int, y: Int) = x to (y - 1)
    },
    LEFT {
        override fun direction(x: Int, y: Int) = (x - 1) to (y)
    },
    RIGHT {
        override fun direction(x: Int, y: Int) = (x + 1) to (y)
    },
    BOTTOM {
        override fun direction(x: Int, y: Int) = x to (y + 1)
    };

    abstract fun direction(x: Int, y: Int): Pair<Int, Int>
}

// Sealed
sealed class Intentions {
    object None : Intentions() {
        override fun log() {
            println("none")
        }
    }

    object Refresh : Intentions() {
        override fun log() {
            println("refresh")
        }
    }

    data class Error(val reason: String) : Intentions() {
        override fun log() {
            println("error")
        }
    }

    data class LoadContent(val content: List<String>) : Intentions() {
        override fun log() {
            println("loadContent")
        }
    }

    abstract fun log()
}