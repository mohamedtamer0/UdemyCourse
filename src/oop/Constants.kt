package oop
const val USER_NAME_FIELD = "UserName"
fun main() {
    val obj = UserInfo("Mohamed","Tamer")
    UserInfo.MAX_AGE

    USER_NAME_FIELD

}

class UserInfo(var firstName: String, var lastName: String) {
    companion object {
        const val MAX_AGE = 30
    }
}