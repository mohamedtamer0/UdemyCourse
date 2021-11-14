package collections

fun main() {

    val names = listOf("Mohamed", "Tamer", "Ahmed", "Ali", "Osama", "Mohamed")
    val find = names.find { it == "Mohamed" }
    println(find)
    println(find?.length)
    println("========================")
    val find2 = names.first { it == "Mohamed" }
    println(find2)
    println("========================")
    val find3 = names.firstOrNull { it == "Mohab" }
    println(find3?.length)

}