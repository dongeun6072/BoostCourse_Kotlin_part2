package chap02.section1

class Person(var id: Int, val name: String, val age: Int) {
//프로퍼티들 Byte코드로 역으로 보면 Get,Set둘다 보임. val 세터가 나올수없다
//    var id: Int = _id
//    val name: String = _name
//    val age: Int = _age
//
}

fun main() {
    val person = Person(1,"Kildong", 30)
    person.id = 2 // setter
    println(person.id) //getter
}