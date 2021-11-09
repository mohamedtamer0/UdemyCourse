package equality

fun main() {

    //Structural Equality
    // == Equal
    //!= inequality

    var name1 = "Mohamed"
    var name2 = "Tamer"
    println(name1 == name2)
    println(name1.equals(name2))
    println(name1 != name2)


    println("===============================")

    //Referential Equality
    // = = =

    var obj1 = Person("Tamer")
    var obj2 = Person("Tamer")

    println(obj1 === obj2)
    println(obj1 !== obj2)

}

class Person(var name: String)