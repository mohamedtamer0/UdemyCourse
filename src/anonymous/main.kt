package anonymous

open class B(val name:String) {
  open  fun printName ():String{
        return "Hi $name"
    }
}

interface MyInter {
    fun printAge():String
}


fun main() {
    val obj = object : B("Tamer"), MyInter {
        //        override fun printName() {
//            super.printName()
//        }
        override fun printAge(): String {
            return "My Age is 25"
        }
    }
    println(obj.printName())
    println(obj.printAge())

}