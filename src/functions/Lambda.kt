package functions

fun main() {

    // val lambdaName: (InputType) -> ReturnType = { arguments:InputType -> body }
    val greeting: (String) -> String = { name: String -> "Hello $name" }
    val test = greeting("Mohamed")
    println(test)


    val greeting2 = { firstName: String,lastName:String ->
        "Hello $firstName $lastName" }
    val test2 = greeting2("Mohamed","Tamer")
    println(test2)

}