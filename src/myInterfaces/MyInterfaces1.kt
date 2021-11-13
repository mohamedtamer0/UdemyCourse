package myInterfaces

interface MyInterfaces1 :
    MyInterfaces2,
    MyInterfaces3,
    MyInterfaces4 {


    fun bar()
    fun foo()

}

open class Test {

}


class Demo : Test(), MyInterfaces1,
    MyInterfaces2,
    MyInterfaces3,
    MyInterfaces4 {
    override fun bar() {
        TODO("Not yet implemented")
    }

    override fun foo() {
        TODO("Not yet implemented")
    }

}


fun main() {

    val obj1 = Demo()
    obj1.bar()
    obj1.foo()

}