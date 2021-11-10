package oop


fun main() {
    var user = User()
    user.firstName = "Mohamed"
    user.lastName = "Tamer"
    user.printFullName()

    println("=========================")

    var user2 = User()
    user2.firstName = "Mohab"
    user2.lastName = "Tamer"
    user2.printFullName()
    user2.updateName("Mohand")
    user2.printWithPrefix("Mr,")
    user2.firstNameLength()
    println("=========================")

    var user3 = User()
    user3.firstName = "Habiba"
    user3.lastName = "Tamer"
    user3.printFullName()
    user3.printWithPrefix("Ms,")
    user3.firstNameLength()

}

