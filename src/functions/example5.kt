package functions

fun main() {
//    person("Tamer",25)
    person(name = "Ahmed", age = 18)
    println("===============")
    person("Tamer", 25 )
    println("===============")
    person("Mohab", 18)

    println("===============")
    person(name = "Mohamed", age = 30)


}

//fun person(name:String, age:Int) {
//    println("$name, and your age is $age")
//}

fun person(name: String,
           age: Int = 25,
           isHappy: Boolean = true,
           job: String = "Developer")
{
    if (age < 21)
        println(
            "Your name is $name, and your age is $age , and your job is $job")
    else
        println("Sorry")

    println("You are Happy? $isHappy")
}