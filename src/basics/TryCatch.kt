package basics

import java.lang.IllegalArgumentException

fun main() {

    //How to Use a Try Catch Statement in Kotlin

    val user = UserInfo("Tamer", 9)

    try {
        checkAge(user)
        println("Done")
    } catch (ex: Exception) {
        when(ex) {
            is NullPointerException -> println("the NullPointerException")
            is IllegalArgumentException -> println("the IllegalArgumentException")
            else -> throw ex
        }
        println("Catch")
    } finally {
        println("finally")
    }

}


private fun checkAge(p: UserInfo) {
    if (p.age < 18) {
        throw NullPointerException("Error")
    }
}

class InvalidException(val age: Int, message: String) : IllegalArgumentException("Invalid age: $age , $message")

data class UserInfo(val name: String, val age: Int)