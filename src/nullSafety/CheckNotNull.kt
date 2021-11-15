package nullSafety

fun main() {

    //filterNotNull
    val names = listOf("Mohamed","Tamer","Ali",null,"Ahmed",null)
    val test = names.filterNotNull()
    println(test)


}