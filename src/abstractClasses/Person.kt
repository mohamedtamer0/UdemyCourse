package abstractClasses


abstract class Person(val name:String) {
    init {
        println("My Name is $name")
    }

    fun displayId(id:Int) {
        println("My Id Is $id")
    }


    abstract fun displayJob(desc:String)
}

class Teacher(name:String):Person(name) {
    override fun displayJob(desc: String) {
        println(desc)
    }

}


fun main() {
    val teacher1 = Teacher("Mohamed Tamer")
    teacher1.displayJob("I'm a software Developer")
    teacher1.displayId(2021)
}

