package yourapp

fun main() {
    println("Enter your Number1: ")
    val number1 = readLine()!!.toInt()
    println("Enter your Number2: ")
    val number2 = readLine()!!.toInt()
    val result = number1 / number2
    println(result)
    println(result.javaClass.name)
}