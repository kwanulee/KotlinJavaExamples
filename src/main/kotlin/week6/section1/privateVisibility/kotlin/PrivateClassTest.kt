package week6.section1.privateVisibility.kotlin

private class PrivateClass {
    private var i = 12
    private fun privateFunc() {
        i += 1 // 접근 허용
    }
}

class OtherClass {
    private val pc = PrivateClass()  // 프로퍼티 지정시 private로 선언해야함
    fun test() {
        val pc = PrivateClass() // 생성 가능
    }
}

fun main() {
    val pc = PrivateClass() // 생성 가능
}

fun TopFunction() {
    val tpc = PrivateClass() // 객체 생성 가능
}