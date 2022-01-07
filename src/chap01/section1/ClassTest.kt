package chap01.section1

class Car {
    val wheel: Int = 4

    fun start(){
        println("Engine Start!")
    }
}

class Bird

fun main() {
    val sonata: Car = Car() // : chap01.section1.Car 생략가능
    println(sonata.wheel)
    sonata.start()
}
