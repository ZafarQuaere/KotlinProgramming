package enums

enum class Direction{
    NORTH,SOUTH,EAST,WEST
}

fun main() {
    val userDirection= Direction.NORTH

    if(userDirection == Direction.SOUTH){
        println("User is moving towards South")
    }else{
        println("I don't know where the user is moving.")
    }
}