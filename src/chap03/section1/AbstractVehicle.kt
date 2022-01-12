package chap03.section1

import kotlin.math.max

abstract class Vehicle(val name: String, val color: String, val weight: Double){
    // 추상 프로퍼티 -하위 클래스에서 오버라이딩
    abstract  val maxSpeed: Double

    //비추상 프로퍼티
    var year: String = "2008"

    // 추상 메서드
    abstract fun start()

    abstract fun stop()

    // 비추상 메서드

    fun displaySpec(){
        println("name:$name,color:$color,wieght:$weight,year:$year,maxSpeed:${maxSpeed}")
    }
}

class Car(name: String,
          color: String,
          weight: Double,
          override val maxSpeed: Double) : Vehicle(name, color, weight) {

    override fun start() {
        println("Car Started")
    }

    override fun stop() {
        println("Car Stopped")
    }

    fun autoPilotOn(){
        println("Auto Pilot ON")
    }

}

class Motorbike(name: String,
          color: String,
          weight: Double,
          override val maxSpeed: Double) : Vehicle(name, color, weight) {

    override fun start() {
        println("Motorbike Started")
    }

    override fun stop() {
        println("Motorbike Stopped")
    }

}

fun main() {
    var car = Car("matiz","red",1000.0,100.0)
//    var v = Vehicle("") 추상클래스로부터 인스턴스 생성 불가
    var motor = Motorbike("motor1","blue",1000.0,100.0)

    car.year = "2014"
    car.displaySpec()

    motor.displaySpec()
    car.start()
    motor.start()
}
