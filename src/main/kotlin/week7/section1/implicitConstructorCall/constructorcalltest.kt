package week7.section1.implicitConstructorCall

open class A {
    constructor() {
        println("생성자 A : no parameter")
    }
    constructor(x:Int) {
        println("생성자 A  with  parameter x")
    }
}

class B : A {
    constructor() {
        println("생성자 B  with  no parameter")
    }
    constructor(x:Int) {
        println("생성자 B with  parameter x")
    }

}


fun main() {
    val b1 = B()
    val b2 = B(5)


}