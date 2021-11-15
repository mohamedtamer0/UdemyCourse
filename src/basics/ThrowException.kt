package basics

fun main() {
    //Throw an Exception
    val p = PersonInfo("Mohamed",10)
    if (p.age < 18) {
        throw IllegalArgumentException("User is not old enough!")
    }

}


data class PersonInfo(val name:String, val age:Int)

