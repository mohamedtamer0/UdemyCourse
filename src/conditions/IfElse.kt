package conditions

fun main() {
    var price = 20
    if (price == 25) {
        println("Price is $price")
    } else if (price < 25) {
        println("Good")
    } else if (price >= 25) {
        println("Price is Expensive")
    } else {
        println("Not Found")
    }

    println("=====================")

    var age = 25
    if (age > 18) {
        println("Your age is $age")
    }else {
        println("Your age is less than 18!")
    }

    var myAge = 25
    if (myAge > 18) println("Your age is $age") else println("Your age is less than 18!")


}