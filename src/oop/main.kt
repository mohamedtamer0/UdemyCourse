package oop


fun main() {

    var user = User("Mohamed", "Tamer")
    println(user.fullName)
    //user.fullName = "Hello World!"
    println(user.fullName)


    println("=========================")
    println("============================================")

    var user1 = User("Mohamed", "Tamer")
    user1.printFullName()
    println("=========================")

    var user2 = User("Mohab", "Tamer")
    user2.printFullName()
    user2.updateName("Mohand")
    user2.printWithPrefix("Mr,")
    user2.firstNameLength()
    println("=========================")

    var user3 = User("Habiba", "Tamer")
    user3.printFullName()
    user3.printWithPrefix("Ms,")
    user3.firstNameLength()

}

