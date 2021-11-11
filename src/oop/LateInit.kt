package oop

fun main() {
    val obj = Info("Mohamed","Tamer")
    obj.favoriteCity = "Cairo"
    println(obj.toString())
}

class Info(var firstName: String, var lastName: String) {
   lateinit var favoriteCity: String

    fun fullName(): String = "$firstName $lastName"

    override fun toString(): String {
        return fullName() + "'s Favorite City is : $favoriteCity"
    }

}