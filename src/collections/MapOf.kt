package collections

fun main() {
    //How To Create a Map in Kotlin

    val names = mapOf(
        1 to "Mohamed",
        2 to "Tamer",
        3 to "Osama",
        4 to "Ali",
        5 to "Mohab"
    )

    val result = names[2]
    println(result)
    println("=======================")
    val result2 = names.containsKey(22)
    println(result2)
    println("=======================")
    val result3 = names.containsValue("Mohamed")
    println(result3)
    println("=======================")
    val result4 = names.entries
    println(result4)

    println("======================================")
    println("How to create a Mutable Map")

}