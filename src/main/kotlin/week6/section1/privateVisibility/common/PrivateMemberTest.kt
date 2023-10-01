package week6.section1.privateVisibility.common

class PrivateMember {
    private var i = 1
    private fun privateFunc() {
        i += 1         // 접근 허용
    }

    fun access() {
        privateFunc() // 접근 허용
    }
}


fun main() {
    val pm = PrivateMember() // 생성 가능
    // pm.i // 접근 불가
    // pm.privateFunc() // 접근 불가
}
