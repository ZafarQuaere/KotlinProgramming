package arrays

fun main (arg : Array<String>){
    simpleArrays()
    otheways()
}

private fun otheways() {
    val nums = IntArray(3)
    nums.set(0,10)
    nums.set(1,110)
    nums.set(2,222)


}

private fun simpleArrays() {

    val nums = intArrayOf(2,4,5,6,8)
    nums[2] = 10
    nums.set(4,20)
    //to print individual as
    for (i in nums)
        println(i)

    println()
    // to print with index
    for ((index,value) in nums.withIndex())
        println("$index : $value")

    println(nums.last())
}
