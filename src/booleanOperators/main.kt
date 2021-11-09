package booleanOperators

fun main() {
    var yourAge = 30
    var myAge = 30

//    if ((myAge != yourAge) && (myAge != yourAge)) {
//        println("true")
//    }

        println(((myAge != yourAge) && (myAge != yourAge)))

    println("=========================")

//    if ((myAge == yourAge) || (myAge != yourAge)) {
//        println("true")
//    }

    //!= not Equal
    println(((myAge != yourAge) || (myAge == yourAge)))
}