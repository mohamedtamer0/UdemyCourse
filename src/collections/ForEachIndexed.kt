package collections

fun main() {
    val fruits1 = listOf(
        NewFruits("Apple"),
        NewFruits("Orange"),
        NewFruits("Banana"),
        NewFruits("Avocado"),
        NewFruits("Blueberries"),
        NewFruits("Lemon"),
        NewFruits("Mango"),
        NewFruits("Mango"),
        NewFruits("Mango"),
        NewFruits("Mango"),
        NewFruits("Mango")
    )

    fruits1.forEachIndexed { index, newFruits ->
        println("Index: $index, Fruits: $newFruits")
    }



}

data class NewFruits(val name: String)