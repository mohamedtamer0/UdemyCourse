package functions

fun main() {
    sayHi()
    printName()

    sum(5,5)
}

fun printName(){
    println("Hello Tamer")
    sayHi()
    println("Hello Mohamed")
    sayHi()
}

fun sayHi() {
    println("Hi!")
}

fun sum (num1:Int ,  num2 :Int) {
    println(num1 + num2)
}

