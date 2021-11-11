package oop

fun main() {
    println(AccountType.PLATINUM)
    val accountTypeFromApi = "gold"

    val accountType = AccountType.valueOf(accountTypeFromApi.uppercase())
    println(accountType)

//    val user = UserLevel("Tamer",AccountType.PLATINUM)


    println("==================================")
    println(AccountType.PLATINUM)
    println(AccountType.PLATINUM.points)
    println(AccountType.PLATINUM.followers)

    println("==================================")
    println(AccountType.GOLD)
    println(AccountType.GOLD.printString())

    println("==================================")
    println(AccountType.BRONZE)
    println(AccountType.BRONZE.printString())

    println("==================================")
    println("Using for")

    for (i in AccountType.values()) {
        println(i)
    }

    println("==================================")
    println("Using forEach")

    AccountType.values().forEach { println(it) }

}


enum class AccountType(val points: Int, val followers: Int) {
    BRONZE(10, 100) {
        override fun printString(): String {
            return "Points:$points, Followers: $followers"
        }
    },
    SILVER(20, 200) {
        override fun printString(): String {
            return "Points:$points, Followers: $followers"
        }
    },
    GOLD(30, 300) {
        override fun printString(): String {
            return "Points:$points, Followers: $followers"
        }
    },
    PLATINUM(40, 400) {
        override fun printString(): String {
            return "Points:$points, Followers: $followers"
        }
    };

    abstract fun printString(): String

}

//class UserLevel(var name:String, accountType: AccountType) {
//
//}