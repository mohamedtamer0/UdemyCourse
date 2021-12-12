package kotlinNewUpdate.standardlibrary

import kotlin.reflect.KType
import kotlin.reflect.typeOf

fun main() {
    describe<List<Int>>()
    describe<Float>()
}

inline fun <reified T : Any> describe() {
    describe(typeOf<T>())
}

fun describe(type: KType) {
    if (type.classifier == List::class) {
        println("It is a list of ${type.arguments.single().type} elements!")
    } else {
        println("This isn't a list! It's a $type.")
    }
}
