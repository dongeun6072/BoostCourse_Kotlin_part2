package chap02.section2

class Person{

    lateinit var name: String

    fun test(){
        if(!::name.isInitialized){
            println("not Initialized")
        } else{
            println("Initialized")
        }
    }
}

fun main() {
    val person = Person()
    //println(person.name)
    person.test()
    person.name = "Kildong"
    person.test()
}