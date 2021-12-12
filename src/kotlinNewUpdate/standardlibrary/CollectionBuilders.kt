package kotlinNewUpdate.standardlibrary
import kotlin.random.Random

fun main() {
    val myList = buildList {
        add("Kotlin")
        add("Java")
        addAll(listOf("PHP", "C++"))
        set(1, "Python")
        if (Random.nextBoolean()) add(0,"JavaScript")
        reverse()
    }
    println(myList)
}
