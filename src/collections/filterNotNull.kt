package collections

fun main() {
    //requireNotNull()

    var name:String? = null
    val length = requireNotNull(name,{"The name should not be null, but it was"}).length
    println(length)


}