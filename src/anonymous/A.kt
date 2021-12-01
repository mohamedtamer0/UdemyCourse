package anonymous

class A(val name:String) {
//    fun printName() {
//        println("Hi $name")
//    }
}


fun main() {

    val helloWorld = object  {
        val hello = "Hello"
        val world = "World"
        override fun toString() = "$hello $world"
        val name = "Tamer"
        fun printName() {
            println("Hi $name")
        }
    }
    println(helloWorld)
    println(helloWorld.printName())


//    val obj = A("Tamer")
//    obj.printName()
}