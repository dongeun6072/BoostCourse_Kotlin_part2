package chap01.section5

internal class InternalClass{
    internal var i = 1
    internal fun icFunc(){
        i+=1
    }
    fun access(){
        icFunc()
    }
}

class Otherc{
    internal val ic = InternalClass() //프로퍼티 지정시 internal로 맞춰야한다.
    fun test(){
        ic.i
        ic.icFunc()
    }
}

fun main(){
    val mic = InternalClass() //탑레벨에서는 가시성 지시자 없이 사용가능하다..?

    mic.i
    mic.icFunc()
}