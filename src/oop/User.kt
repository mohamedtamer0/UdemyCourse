package oop

class User (var firstName: String,var lastName: String) {

    val fullName = "$firstName $lastName"

    init {
        println("Hello 1")
        println("This is the class for user $fullName")
    }

//    init {
//        println("Hello 2")
//    }
//

//    constructor(firstName: String):this(firstName,"Mohamed") {
//        println("2nd")
//    }


//    constructor(firstName: String,lastName: String):this(firstName,lastName,false) {
//        println("2nd")
//    }
//
//    constructor(firstName: String):this(firstName,"None") {
//        println("3rd")
//    }


    fun printFullName() {
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix: String) {
        println("$prefix $firstName")
    }

    fun updateName(newName: String) {
        firstName = newName
    }

    fun firstNameLength() {
        println(firstName.length)
    }


}