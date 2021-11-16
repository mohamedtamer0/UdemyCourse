package polymorphism

fun main() {

    val obj:A = B()
    obj.printInfo()
    println(obj.javaClass.name)
}