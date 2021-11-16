package yourapp

fun main() {
    println("Enter Your Name: ") // Mohamed Tamer
    val name = readLine()!!.toString()
    val value = name.split(' ')
    val firstChar = value[0].substring(0,1)
    val lastChar = value[1].substring(0,1)
    println("$firstChar$lastChar")
}