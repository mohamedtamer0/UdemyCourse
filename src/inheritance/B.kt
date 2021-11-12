package inheritance

// Sub class
open class B : A() {

    var job: String = ""

    fun printJob(): String {
        return job
    }

    //Super / this
//    fun printAllInfo():String {
//        return super.name
//    }



}