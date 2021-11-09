package functions

fun main() {

    var x = sayHello()
    sayHello()
    println(x)


    var y = sayHello2()
    println(y)

    var z = sayHello3()
    println(z)
}

fun sayHello(): String {
    return "Hello World"
}


fun sayHello2(): Int {
    return 25
}

fun sayHello3(): Boolean {
    return true
}

