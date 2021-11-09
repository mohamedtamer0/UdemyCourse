package functions

fun main() {
    printHi()

    val age = 25

//    fun doWork() {
//        if (age < 18) {
//            println("less than 18")
//        }else {
//            println("Oky")
//        }
//    }
//    doWork()

    fun doWork() = if (age < 18) println("less than 18") else println("Oky")

    doWork()
}

//fun printHi() {
//    println("Hi!")
//}

fun printHi() = println("Hi!")

