package modifiers

/////Access Modifiers
/*
1- public
2- private
3- protected
 */

///Encapsulation
open class A {

    private var name: String = ""
    var setAndGetName: String
        get() = this.name
        set(value) {
            this.name = value
        }


//    fun setName(p_name:String) {
//        this.name = p_name
//    }
//
//    fun getName():String {
//        return this.name
//    }


}

class B : A() {

    fun print(): String {
        return super.setAndGetName
    }


//    fun print(): String {
//        super.setName("Mohamed")
//        return super.getName()
//    }
}


fun main() {

    val obj1 = A()
    obj1.setAndGetName = "Mohamed"
    println(obj1.setAndGetName)

    val obj2 = B()
    obj2.setAndGetName = "Tamer"
    println(obj2.setAndGetName)


//    val obj = A()
//    obj.p_name = ("Tamer")
//    println(obj.getName())
//
//    val obj2 = B()
//    obj2.setName("Osama")
//    println(obj2.getName())
//    val n = obj2.print()
//    println(n)

}


