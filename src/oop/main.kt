package oop


fun main() {
    var user = User("Mohamed","Tamer",true)
    user.printFullName()
    println("=========================")

    var user2 = User("Mohab","Tamer")
    user2.printFullName()
    user2.updateName("Mohand")
    user2.printWithPrefix("Mr,")
    user2.firstNameLength()
    println("=========================")

    var user3 = User("Habiba")
    user3.printFullName()
    user3.printWithPrefix("Ms,")
    user3.firstNameLength()

}

