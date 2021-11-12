package inheritance

fun main() {

    val obj1 = B()
    obj1.name = "Tamer"
    obj1.age = 25
    obj1.job = "Developer"
    println(obj1.printInfo())
    println(obj1.printJob())
    println("==========")
    val obj2 = C()
    obj2.email= "hhhd@jj.com"
    obj2.name = "Mohamed"
    obj2.age = 30
    obj2.job = "Front end"
    println(obj2.printEmail())
    println(obj2.printInfo())
    println(obj2.printJob())
}