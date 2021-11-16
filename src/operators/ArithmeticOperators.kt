package operators

/*
    Arithmetic Operators
    +	Addition operator (also used for String concatenation)
    -	Subtraction operator
    *	Multiplication operator
    /	Division operator
    %	Remainder operator
 */
fun main() {

    val number1 = 12.5
    val number2 = 3.5
    var result:Double


    result = number1 + number2
    println("Addition : $result")

    result = number1 - number2
    println("Subtraction : $result")


    result = number1 * number2
    println("Multiplication : $result")

    result = number1 / number2
    println("Division : $result")

    result = number1 % number2
    println("Remainder : $result")




}