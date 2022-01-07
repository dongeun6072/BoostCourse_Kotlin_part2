package chap01.section3

open class Bird(var name: String, var wing: Int, var beak: String){  //주생성자 기법

    open fun fly(){
        println("Fly")
    }
}

class Lark(name:String, wing:Int, beak:String) : Bird(name, wing, beak){

    override fun fly(){
        println("Quick Fly")
    }

    fun singHitone(){
        println("sing Hitone")
    }

}

class Parrot: Bird{
    var language: String
    constructor(name: String, wing: Int, beak: String, language: String) : super(name,wing,beak) { //부생성자 초기화 방법
        this.language = language
    }

    override fun fly(){
        println("Slow Fly")
        super.fly() //상위 메서드의 참조
    }

    fun speak(){
        println("Speak: $language")
    }
}

fun main() {
     val lark: Bird = Lark("mylark",2,"short")
     val parrot: Bird = Parrot("myparrot",2,"long","English")

     println("lark - name: ${lark.name}")
     //println("parrot -name: ${parrot.name}, lang: ${parrot.language}")

     //lark.singHitone()
     lark.fly()

     //parrot.speak()
     parrot.fly()

}