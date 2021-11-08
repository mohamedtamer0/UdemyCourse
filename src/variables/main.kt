package variables

fun main() {

    val firstName2:String = "Ali"
    //firstName2 = "ahmed"
    println(firstName2.isEmpty())

    val myAge:Int = 30
    //myAge = 66
    println(myAge)




    println("=========================")


    var firstName = "Mohamed"
    firstName = "Ahmed"

    println(firstName.isEmpty())

    var lastName = "Tamer"
    println(lastName.isEmpty())

    var age = 25
    println(age)


    println("=========================")

    var car:String = "BMW"

    var car2:String = "BMW"
    println(car2::class)

    var number:Int = 25
    println(number::class)

}