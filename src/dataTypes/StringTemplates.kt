package dataTypes

fun main() {
    val message:String = """
        Hello,
        My Name is Mohamed.
        How are you?
    """.trimIndent()
    println(message)

    println("===================")

    val message2:String = """
        Hello,
        My Name is Ahmed.
        How are you?
    """.replaceIndent("- ")
    println(message2)

    println("===================")

    val message3:String = """
        >> Hello,
        >> My Name is Ali.
        >> How are you?
    """.trimMargin(">>")
    println(message3)

    println("===================")

    val name = "Tamer"
    val age = 25
    println("Hello $name your age is $age and your name is ${name.length} Characters long")
    println(name.length)

}