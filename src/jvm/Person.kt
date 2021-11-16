package jvm

class PersonInfo(var name: String, cst: UserInfo) {

    init {
        val test = cst.customer("Data")
    }

    fun printInfo() {
        println("Your name is $name")
    }
}
