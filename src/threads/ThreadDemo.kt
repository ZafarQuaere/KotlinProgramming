package threads

fun main(args: Array<String>) {
    val t1 = MyThread()
    t1.start()

    println("Thread started...")
}

class MyThread : Thread() {

    override fun run() {
        var count = 0
        while (count < 10){
            println(count)
            count++

            try {
                Thread.sleep(1000)
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}