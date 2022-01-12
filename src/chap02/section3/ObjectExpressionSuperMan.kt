package chap02.section3

//object표현식
open class Superman(){
    fun work() = println("Taking photos")
    fun talk() = println("Talking with people")
    open fun fly() = println("Flying in the air.")
}

fun main() {
    val pretendedMan = object: Superman(){ //접근 시점에서 인스턴스가 생성된다
        override fun fly() = println("I'm not a real superman. I can't fly!")
    }
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}