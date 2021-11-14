package collections

fun main() {
    val items = listOf("Mohamed Tamer", "Ahmed Ali", "Osama Mohamed", "Khaled Ahmed")
    val result = items.map { it.substring(0,3).uppercase() }
    println(result)
    println("=================================")

    val result2 = items.map { "Foo" }
    println(result2)
    println("=================================")
    val items2 = listOf("Mohamed Tamer", "Ahmed Ali", "Osama Mohamed", "Khaled Ahmed")
    val result3 = items2.map {
        val words = it.split(' ')
        words[0].substring(0,1) + words[1].substring(0,1)
    }
    println(result3)
    println("=================================")
    val items3 = listOf("Mohamed Tamer", "Ahmed Ali", "Osama Mohamed", "Khaled Ahmed")
    val result4 = items3.map { it.substring(0,3).uppercase() }
        .reversed()
    println(result4)
}