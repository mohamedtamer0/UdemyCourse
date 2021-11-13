package loop

fun main() {

    val i = 100
    if (i in 1..50) {
        println("Yes")
    }else{
        println("No")
    }

    for (j in 0..10 step 2) {
        println(j)
    }
}