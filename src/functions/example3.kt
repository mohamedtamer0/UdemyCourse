package functions

fun main() {
    sayHiAndBye()
}

fun sayHiAndBye() {

    println("Hi!")

    fun sayBye() {
        println("Bye")

        fun name() {
            println("Ahmed")
        }

        name()
    }
    sayBye()
}