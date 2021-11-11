package oop

fun main() {
    println(AccountType.PLATINUM)
    val accountTypeFromApi = "gold"

    val accountType = AccountType.valueOf(accountTypeFromApi.uppercase())
    println(accountType)

    val user = UserLevel("Tamer",AccountType.PLATINUM)

}


enum class AccountType {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM
}

class UserLevel(var name:String, accountType: AccountType) {

}