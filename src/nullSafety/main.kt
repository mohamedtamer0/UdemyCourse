package nullSafety

import functions.person

fun main() {
//    var name:String = "Tamer"
//    name = null

    var name2: String? = "Tamer"
    name2 = null
    println(name2)


//    var age:Int = 25
//    age = null

    var age: Int? = 25
    age = null
    println(age)

    println("==============================================")

    //Safe calls ?.

    println("Safe calls ?.")
    var firstName: String = "Mohamed"
    var length = firstName.length
    println(length)

    println("==============================================")

    var lastName: String? = "Tamer"
    lastName = null
    var length2 = lastName?.length
    println(length2)
    println("==============================================")
    var length3 = if (lastName != null) lastName.length else 0
    println(length3)
    println("==============================================")
    var length4 = lastName?.substring(0, 2)?.length
    println(length4)


    println("==============================================")

    //Elvis operator ?:
    println("Elvis operator ?:")

    var lastName2: String? = "Ali"
    lastName2 = null
    var length5: Int = if (lastName2 != null) lastName2.length else 0
    println(length5)

    var length6: Int = lastName2?.substring(0, 1)?.length ?: 0
    println(length6)


    println("==============================================")

    //The !! operator
    println("The !! operator")

    var name: String? = "Mohamed Tamer"
    var length7:Int? = name!!.length
    println(length7)

    var sayHi:String? = null
    var length8:Int? = sayHi?.length


}




