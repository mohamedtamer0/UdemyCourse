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

    val p1 = DataClass("Ali",30,"Developer")
    println(p1.component1())
    println(p1.component2())
    println(p1.component3())

    println("==============================")

    val (name,age,job) = DataClass()
    println(name)
    println(age)
    println(job)
}

//equals /hashCode / toString
data class DataClass(val name: String = "Unknown", val age: Int = 0, val job:String="None") {
    fun myInfo(): String{
        return "my name is $name and my Age is $age"
    }
}