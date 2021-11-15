package basics

fun main() {
    //Generics
    val objString:List<String> = listOf("Mohamed","Tamer")
    val objInts:List<Int> = listOf(1,2,3,4,5)

    val result = Names(objString)
    println(result.items())

    val result2 = Names(objInts)
    println(result2.items())

}

class Names<T>(val list:List<T>) {
    fun items():List<T> {
        return list
    }
}




