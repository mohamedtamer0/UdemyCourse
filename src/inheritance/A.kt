package inheritance

//Super class
open class A {
    var name:String = ""
    var age :Int = 0

    fun printInfo():String {
        return "$name $age"
    }
}