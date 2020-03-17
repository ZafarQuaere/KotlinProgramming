package codility

fun main(args: Array<String>) {
    println("Enter source position :")
    var x = readLine()!!.toInt()
    println("Enter destination position :")
    var y = readLine()!!.toInt()
    println("Enter distance travel in one jump :")
    var d = readLine()!!.toInt()
    if (y != 0 && y > x && d > 0) {
        countTheMinimalJumps(x, y, d)
    }

}

fun countTheMinimalJumps(x: Int, y: Int, d: Int) {
    var totalDistance = 0
    var minimalJump = 0
    do {
        totalDistance = if (totalDistance == 0)
            x + d
        else
            totalDistance + d
        minimalJump++
    } while (totalDistance <= y)

    println("Minimal Jump required is : $minimalJump")
}
