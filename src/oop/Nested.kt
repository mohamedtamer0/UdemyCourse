package oop

fun main() {
    val obj = Nested()
    obj.sayHi = "Hi!"
    val obj1 = obj.NestedTwo()
    obj1.info()
    println("===================")
    val obj2 = Nested.NestedThree()
    obj2.info()
}


class Nested {
    var sayHi: String = ""

    inner class NestedTwo {
        var name: String = "$sayHi This is a Nested class Two"
        fun info() = println(name)
    }

    class NestedThree {
        var name: String = "This is a Nested class Three"
        fun info() = println(name)
    }


}