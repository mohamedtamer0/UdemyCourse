package oop

class A (var firstName:String,var lastName:String){

    fun fullName():String = "$firstName $lastName"

    fun fullNameLength():Int {
        return fullName().length
    }
}

fun main() {
    val user = A("Mohamed","Tamer")
    println(user.fullName())
    println(user.fullNameLength())
}