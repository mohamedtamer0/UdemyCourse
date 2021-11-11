package whenExpression

fun main() {

    val user = User("Ali", "Tamer")

    when {
        user.firstName == "Mohamed" && user.lastName == "Tamer" -> {
            println("This is Mohamed Tamer")
        }
        else -> println("This is not Mohamed Tamer")
    }

    //    when(user.firstName) {
//        "Mohamed" -> println("This is Mohamed")
//        "Tamer" -> println("My Father")
//        else -> println("This is not Mohamed Tamer")
//    }

    println("========================================")

    //Exhaustive vs Non-exhaustive When Expressions in Kotlin
    val accountType = AccountType.PLATINUM

    val msg = when (accountType) {
        AccountType.BRONZE -> {
            "BRONZE Member Access Allowed"
        }
        AccountType.SILVER -> {
            "SILVER Member Access Allowed"
        }
        AccountType.GOLD -> {
            "GOLD Member Access Allowed"

        }
        AccountType.PLATINUM -> {
            "PLATINUM Member Access Allowed"

        }
        else -> "Unknown member type"
    }

    println(msg)


}


enum class AccountType {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM
}


class User(var firstName: String, var lastName: String) {

}