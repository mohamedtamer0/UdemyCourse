package loop

fun main() {

    val values = listOf(1,2,3,4,5,6)
    for (i in values) {
        println(i)
    }

//    val values = listOf(1, 2, 3, 4, 5, 6)
//    for (numbers in values) {
//        println(numbers)
//    }

//    val values = listOf("Koltin","Java","Js","HTML")
//    for (lang in values) {
//        println(lang)
//    }

    //counter
    for (i in 0 until 10) {
        println(i)
    }

//    val start = 0
//    val stop = 77
//    for (i in start until stop) {
//        println(i)
//    }

    val start = 0
    val stop = 77
    for (i in start until stop step 3) {
        println(i)
    }

    for (y in 100 downTo 0) {
        println(y)
    }


    for (i in 100 downTo 0 step 2) {
        println(i)
    }





}