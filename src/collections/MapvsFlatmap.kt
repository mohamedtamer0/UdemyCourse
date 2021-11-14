package collections

fun main() {
    //Map vs Flatmap In Kotlin
    /*\
     Map : Returns a list containing the results of applying the given
     transform function to each element in the original collection.
     ==============================
     Flatmap : Returns a single list of all elements yielded from results of transform
      function being invoked on each element of original collection.
     */
    val fruits1 = listOf("Apple", "Orange", "Banana", "Avocado")
    val fruits2 = listOf("Blueberries", "Lemon", "Mango")
    val fruits3 = listOf("Passion Fruit", "Watermelon")

    val allFruits = listOf(fruits1, fruits2, fruits3)

    val resultMap = allFruits.map { it }
    println(resultMap)

    val resultFlatMap = allFruits.flatMap { it }
    println(resultFlatMap)



}