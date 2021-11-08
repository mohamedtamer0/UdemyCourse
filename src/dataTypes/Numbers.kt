package dataTypes

fun main() {

    val myByte:Byte = 8
    val myShort:Short = 16
    val myInt:Int = 12
    val myLong:Long = 64

    //decimals
    val myFloat:Float = 32.00F
    val myDouble:Double = 64.00

    println(myByte::class)
    println(myByte.toLong())
    println(myByte.toLong()::class)

    val newInt = myInt.plus(12)
    println(newInt)

}