package chap01.section5

private class PrivateText{
    private var i = 1
    private fun privateFunc(){ //Private
        i += 1
        println(i)
    }
    fun access(){ //Public
        privateFunc()
    }
}

class OtherClass{
    // val pc = PrivateText() // 공개 생성 불가
    fun test(){
        val pc = PrivateText() //이건 왜 가능하지??
        pc.access()
    }
}

fun main() {

    val pc = PrivateText()
    //pc.i = 5
    //pc.privateFunc()
    pc.access()
}

fun topFunction(){  // 탑레벨(Main다음)에서는 가능하다?..
    val pc = PrivateText()
}