package collections

fun main() {
   /*
    How to Generate Large Sequences and Lists in Kotlin with
     generateSequence
    */
    val fooSequence = generateSequence(1) { it + 1 }
        .take(1_000_000).toList()
    println("Done!")


}