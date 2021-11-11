package oop

class D(var firstName: String, var lastName: String) {

    var fullName: String = "$firstName $lastName"
        get() = "FullName: $field"
        set(value) {
            if (value.startsWith("Mohamed")) {
                field = "Ahmed Tamer"
            } else {
                field = "Mohab Tamer"
            }
        }
}

fun main() {
    val obj = D("Mohamed", "Tamer")
    println(obj.fullName)
    obj.fullName = "Osama"
    println(obj.fullName)

}
