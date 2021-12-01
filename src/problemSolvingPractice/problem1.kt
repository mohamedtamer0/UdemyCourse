package problemSolvingPractice

/*Write a program that reads three integer numbers and prints true
if the first number lies between the second and third one (inclusive). Otherwise,
 it is to print false.
The sorting order of the two last arguments can be any.


======
Sample Input:
40
30
50
==
Sample Output :
true
======================================
Sample Input :

2
3
4
Sample Output :
false
*/


fun main() {
//    val num1: Int = readln().toInt()
//    val num2: Int = readln().toInt()
//    val num3: Int = readln().toInt()


    val n = readln().toInt()
    val (a,b) = List(2){readln().toInt()}.sorted()
    println(n in a..b)


//    val (num1,num2,num3) = IntArray(3){readln().toInt()}
//    println(num1 in num2..num3 || num1 in num3..num2)



//    println(num1 in num3 downTo num2 || num1 in num2 downTo num3)


//    val check1 = num1 >= num2 && num1 <= num3
//    val check2 = num1 >= num3 && num1 <= num2
//    val result = check1 || check2
//    println(result)


//    if (num1 >= num2 && num1 <=num3 || num1 >= num3 && num1 <= num2) {
//        println(true)
//    }else {
//        println(false)
//    }

}