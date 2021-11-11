package oop

class B {

    companion object {
        var firstName:String = "Mohamed"
        var lastName:String = "Tamer"

        fun fullName():String = "$firstName $lastName"

        fun fullNameLength():Int {
            return fullName().length
        }
    }
}

fun main() {
    val obj = B.lastName
    println(obj)
    println(B.firstName)
    println(B.fullName())
    println(B.fullNameLength())
}