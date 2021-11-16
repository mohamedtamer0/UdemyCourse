package operators

//Prefix and Postfix in Kotlin                          PreFix   PostFix
//    ++	        Increment: increases value by1	    ++a       a++
//    --	        Decrement: decreases value by 1 	--a       a--


fun main() {

    var a = 6
    var b = 0
    println("a value is $a")
    println("b value is $b")

    //PostFix
    b = ++a
    println("a value is $a")
    println("b value is $b")


}