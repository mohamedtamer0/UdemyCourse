package infix

fun main() {
    val sum = 5 add 5 // infix call
   // val x = 15.add(5)
    println(sum)
}

infix fun Int.add(value:Int):Int = this + value
