package loop

fun main() {

    //ForEach
    val values = listOf("Koltin","Java","Js","HTML")
    for (it in values) {
        println(it)
    }

    println("====================")
    values.forEach { println(it) }

}