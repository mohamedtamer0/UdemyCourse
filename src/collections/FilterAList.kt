package collections

fun main() {
    val names = listOf("Mohamed", "Tamer", "Ahmed", "Ali", "Osama", "Mohamed")
    val filter = names.filter { it != "Mohamed" }
    println(filter)
    println("=====================")
    val filter2 = names.filter { it == "Mohamed" }
    println(filter2)

    println("=====================")
    val ages = listOf(23, 18, 85, 10, 40, 11, 9, 16)
    val filter3 = ages.filter { it >= 18 }
    println(filter3)

    println("=====================")
    val filter4 = ages.filter(::isChild)
    println(filter4)

}

fun isChild(value: Int): Boolean {
    return value <= 18
}

