package problemSolvingPractice

/*
Write a program that reads five words from the standard input and outputs the words in one line.
 In the output, the words should be separated by a single space.
 =====

Sample Input:
Never
gonna
give
you
up
==================

Sample Output:
Never gonna give you up


 */



fun main() {


    print(mutableListOf<String>().also { lst -> repeat(5) {lst.add(readln())} }.joinToString(" "))


//    val a = List(5){ readln()}
//    a.forEach { print("$it ") }


//    println(Array(5){ readln()}.joinToString(separator = " "))

//    val word1 = readln()
//    val word2 = readln()
//    val word3 = readln()
//    val word4 = readln()
//    val word5 = readln()
//
//    println("$word1 $word2 $word3 $word4 $word5")
}