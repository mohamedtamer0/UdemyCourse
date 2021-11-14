package collections

fun main() {
    //Arrays
    val item1 = arrayOf(1, 2, 3, "Tamer", 4)
    item1.forEach { println(it) }
    println("================================")

    val item2 = intArrayOf(1, 2, 3, 4, 5)
    item2.forEach { println(it) }

    println("================================")

    val item3 = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    item3.forEach { println(it) }

    println("================================")

    val item4 = arrayOf(
        User("Mohamed","Tamer"),
        User("Mohab","Tamer")
    )
    item4.forEach { println(it) }
    println("================================")
    val updateUser = item4.plus(User("Osama","Tamer"))
    updateUser.forEach { println(it) }
    println("================================")
    item4[0] = User("Foo","Bar")
    val index = item4[0]
    println(index)
    println("================================")
    item4.forEach { println(it) }

}


class User(var firstName:String, var lastName:String) {
    var fullName = "$firstName $lastName"

    override fun toString(): String {
        return fullName
    }
}