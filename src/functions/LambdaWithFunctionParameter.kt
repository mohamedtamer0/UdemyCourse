package functions

fun main() {
    //How to use a Lambda Function as a Function Parameter in Kotlin

//    sayHi {
//        println("message 1 ")
//        println("message 2 ")
//        println("message 3 ")
//
//    }

    repeater(5) {
        if (it < 3) {
            // 3 times
            println("Hello")
        }else {
            // 2 times
            println("Goodbye")
        }
    }


}
// val lambdaName: (InputType) -> ReturnType = { arguments:InputType -> body }
fun repeater(time: Int, block: (Int) -> Unit) {
    repeat(time) { index -> block(index) }
}




fun sayHi(block: () -> Unit) {
    repeat(5) { println("-------") }
    block()
    repeat(5) { println("-------") }
}

//fun sayHi(message:String) {
//    repeat(5){ println("-------")}
//    println(message)
//    repeat(5){ println("-------")}
//}