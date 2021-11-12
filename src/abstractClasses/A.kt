package abstractClasses

abstract class A (val name:String, val age:Int){
    abstract fun printName()
    abstract fun printAge()
}

class B:A("Mohamed",25) {
    override fun printName() {
        println(name)
    }

    override fun printAge() {
        println(age)
    }

}


fun main() {

    val obj= B()
    obj.printName()
    obj.printAge()

}