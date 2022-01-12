package chap03.section1

interface Pet{
    var category: String // abstract 키워드가 없어도 기본은 추상 프로퍼티
    var species: String
    val msgTags: String //val 선언시 게터의 구현이 가능
        get() = "i'm your lovely pet!"
    fun feeding() // 마찬가지로 추상메서드
    fun patting(){ //일반메서드 : 구현부를 포함하면 일반적인 메서드로 기본이 됨
        println("keep patting!") // 구현부
    }
}

open class Animal (val name: String)

class Dog(name: String, override var category: String) : Animal(name), Pet{

    override  var species: String = "dog"

    override fun feeding() {
        println("Feed the dog a bone")
    }
}

class Master{
    fun playWithPet(pet: Pet){
        println("Enjoy with my ${pet.species}.")
    }
}

class Cat(name:String , override var category: String) : Pet {

    override  var species: String = "cat"

    override fun feeding(){
        println("Feed the cat a tuna can!")
    }
}

fun main() {

    val master = Master()
    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco","BigFat")
    master.playWithPet(dog)
    master.playWithPet(cat)


}