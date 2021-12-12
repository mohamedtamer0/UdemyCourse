package kotlinNewUpdate.standardlibrary

fun main() {
    val text = "one OR two AND three&four BUT five MAYBE six"

    val combinedNumbers = text
        .splitToSequence(" [A-Z]+ ".toRegex())
        .onEach { println("Processing $it") }
        .first { it.contains("&") }

    println("Combined: $combinedNumbers")
}