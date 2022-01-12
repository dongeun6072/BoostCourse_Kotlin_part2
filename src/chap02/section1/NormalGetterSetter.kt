package chap02.section1



class User(_id: Int, _name: String, _age: Int){

    val id: Int = _id
        get() = field // 여기서 id프로퍼티를 사용하면 무한 호출되는 재귀에 빠진다.

    var name: String = _name
        get() = field
        set(value){ //var이기 때문에 set이 가능하다
            field = value
        }

    var age: Int = _age
        get() = field
        set(value){
            field = value
        }
}

fun main() {
    val user1 = User(1,"Kildong", 30)
    user1.age = 35 //세터 동작
    println("user1.age = ${user1.age}")
}