package functions

fun main() {
    //How to use Function Arguments in Kotlin
//    person("Tamer",25)

    person("Ahmed",25,false)
    println("===============================")
    person("Tamer",18,true)

}

//fun person(name:String, age:Int) {
//    println("$name, Your age is $age")
//}

fun person(name:String,age:Int, isHappy:Boolean) {
    if (age < 21)
        println("your name is $name, and your age is $age")
    else
        println("Sorry")

    println("You are happy? $isHappy")

}