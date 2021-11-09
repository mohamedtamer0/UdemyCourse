package functions

fun main() {
    //  variable number of arguments (vararg)
    printBookInf("Hello Kotlin","Tamer","Ahmed","Ali")
}


fun printBookInf(title:String, vararg authors:String) {
    println("$title - Authors : ")
    authors.forEach { println(it) }
}