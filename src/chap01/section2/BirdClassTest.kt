package chap01.section2

class Bird{ /*constructor 생략가능(var name:String, val wing: Int, var beak: String){ *///주생성자
    //프로퍼티
    var name: String
    val wing: Int
    var beak: String  // 이것들을 생략하고 위에 적을수 있음.

    constructor(name: String, wing: Int, beak: String){
        this.name = name
        this.wing = wing
        this.beak = beak
    }  //부생성자 기법

    constructor(name: String, beak: String){
        this.name = name
        wing = 2
        this.beak = beak
    }


//    init{  init은 객체가 만들어지고 실행되어진다
//        println("------- init start ---------")
//        name = name.capitalize()
//        println("name: $name, wing: $wing , beak: $beak")
//        println("------- init  end ----------")
//    }

    //메서드
    fun fly(){
        println("Fly")
    }

}

fun main(){
    val coco = Bird("coco",2 ,"long")
    val coco2 = Bird("coco","short")

    coco.fly()
    println(coco.name)
    println(coco.wing)
    println(coco.beak)
    println(coco2.name)
    println(coco2.wing)
    println(coco2.beak)
}
