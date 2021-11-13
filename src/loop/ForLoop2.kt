package loop

fun main() {
//    *
//    * *
//    * * *
//    * * * *
//    * * * * *

//    val rows = 5
//    for (i in 1..rows) {
//        for (j in 1..i) {
//            print("* ")
//        }
//        println()
//    }


//    * * * * *
//    * * * *
//    * * *
//    * *
//    *


//    val rows = 5
//    for (i in rows downTo 1) {
//        for (j in 1..i) {
//            print("* ")
//        }
//        println()
//    }


/*
1
2 3
4 5 6
7 8 9 10
 */

    val rows = 4
    var number = 1
    for (i in 1..rows) {
        for (j in 1..i) {
            print("$number ")
            ++number
        }
        println()
    }


}