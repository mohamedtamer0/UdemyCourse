package oop


fun main() {
    val dc1 = DataClass("Mohamed", 25)
    val dc2 = DataClass("Ahmed", 30)
    val dc3 = DataClass()

    println(dc1 == dc2)
    println(dc1.myInfo())
    println(dc2.myInfo())
    println(dc3)
    println("==============================")

    val p1 = DataClass("Ali", 30, "Developer")
    println(p1.component1())
    println(p1.component2())
    println(p1.component3())

    println("==============================")

    val (name, age, job) = DataClass()
    println(name)
    println(age)
    println(job)

    println("==============================")
    println("copy() Fun")

    val obj = DataClass("Osama", 26, "Developer")
    val myCopy = obj.copy(name = "Ali", age = 33, job = "Developer")
    println(myCopy)

    val order = Order(amount = 100, cst = myCopy)
    println(order)

    val order2 = order.copy(amount = 300)
    println(order2)
}

data class Order(val amount: Int, val cst: DataClass)

//equals /hashCode / toString
data class DataClass(val name: String = "Unknown", val age: Int = 0, val job: String = "None") {
    fun myInfo(): String {
        return "my name is $name and my Age is $age"
    }
}