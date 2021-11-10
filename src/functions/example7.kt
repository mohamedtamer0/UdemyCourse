package functions

fun main() {
    //How to Overload a Function in Kotlin
    printUserInfo("Mohamed")
    printUserInfo("Tamer",25)
    printUserInfo("Ali", 23, "Developer")
}

fun printUserInfo(name: String) {
    println("my name is $name")
}

fun printUserInfo(name: String, age:Int) {
    println("my name is $name , and my age is $age")
}

fun printUserInfo(name: String, age:Int, job:String) {
    println("my name is $name , and my age is $age , and my job is $job")
}

