package anonymous

class A(val name:String){
    fun printName() {
        println("Hi $name")
    }
}


fun main() {
    val obj = A("Tamer")
    obj.printName()
}