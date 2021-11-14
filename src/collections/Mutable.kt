package collections

fun main() {
//    val item = listOf(1,2,3,4,5)
//    item.add

    val item = mutableListOf(1,2,3,4,5)
    item.forEach { println(it) }
    println("==========================")
    item.add(6)
    item.forEach { println(it) }
    println("==========================")
    item.add(6,50)
    item.forEach { println(it) }
    println("==========================")
    item.remove(50)
    item.forEach { println(it) }
    println("==========================")
    item.removeAt(5)
    item.forEach { println(it) }

    println("==========================")

    val item2 = mutableListOf(
        User("Mohamed","Tamer"),
        User("Mohab","Tamer")
    )
    item2.forEach { println(it) }
    println("==========================")
    item2.removeAt(0)
    item2.forEach { println(it) }
    println("==========================")
    item2[0] = User("Mohand","Tamer")
    item2.forEach { println(it) }


}