package collections

fun main() {
    val fruits1 = listOf(
        Fruits("Apple"),
        Fruits("Orange"),
        Fruits("Banana"),
        Fruits("Avocado")
    )

    val fruits2 = listOf(
        Fruits("Blueberries"),
        Fruits("Lemon"),
        Fruits("Mango"),
        Fruits("Mango"),
        Fruits("Mango"),
        Fruits("Mango"),
        Fruits("Mango"),

    )


    val allFruits = fruits1.union(fruits2).union(listOf(Fruits("Mango")))
    println(allFruits)

}

data class Fruits(val name: String)