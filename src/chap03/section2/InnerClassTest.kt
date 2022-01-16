package chap03.section2

class Smartphone(val model : String){

    private  val cpu = "Exynos"

    inner class ExternalStorage(val size : Int){
        fun getInfo() = "${model} : Installed on $cpu with ${size}Gb" //바깥 클래스의 프로퍼티 접근
    }
}

fun main(){
    val mysdcard = Smartphone("S7").ExternalStorage(32)
    println(mysdcard.getInfo())
}