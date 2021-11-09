package functions

fun main() {
//    person("Tamer",25)
    person("Ahmed",18,true)
    println("===============")
    person("Tamer",25,false)
    println("===============")
    person("Mohab",18,false)
}

//fun person(name:String, age:Int) {
//    println("$name, and your age is $age")
//}

fun person(name: String, age: Int, isHappy: Boolean) {
    if (age < 21)
        println("Your name is $name, and your age is $age")
    else
        println("Sorry")

    println("You are Happy? $isHappy")
}