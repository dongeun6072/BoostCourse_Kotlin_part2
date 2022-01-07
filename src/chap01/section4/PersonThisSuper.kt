package chap01.section4.Pri

open class Person{
    constructor(firstName: String){
        println("[Person] firstName: $firstName")
    }

    constructor(firstName: String, age:Int){
        println("[Person] firstName: $firstName, $age") //->3
    }
}

class Developer: Person{

    constructor(firstName: String) : this(firstName,10){ // -> 1
        println("[Developer] $firstName")
    }

    constructor(firstName: String, age: Int): super(firstName,age){  // -->2
        println("[Developer] $firstName, $age")
    }
}

fun main() {
    val sean = Developer("Sean")
}