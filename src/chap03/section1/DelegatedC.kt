package chap03.section1

interface A{
    fun functionA(){}
}

interface B{
    fun functionB(){}
}

class DelegatedC(a: A, b: B) : A by a, B by b{
    fun functionC(){
        functionA()
        functionB()
    }
}