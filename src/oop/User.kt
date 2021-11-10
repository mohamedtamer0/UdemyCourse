package oop

class User {
    var firstName: String = ""
    var lastName:String = ""

    fun printFullName() {
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix:String) {
        println("$prefix $firstName")
    }

    fun updateName(newName:String) {
        firstName = newName
    }

    fun firstNameLength() {
        println(firstName.length)
    }


}