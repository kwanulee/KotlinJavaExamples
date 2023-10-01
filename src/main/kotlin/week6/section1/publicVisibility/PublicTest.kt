package week6.section1.publicVisibility

class PublicClass {

    var i = 1
    fun publicFunc() {
        i += 1 // 접근 허용
    }

    fun access() {
        publicFunc() // 접근 허용
    }
}

 class OtherClass {
    var pc = PublicClass()
    fun test() {
        pc.i = 1 // 접근 허용
        pc.publicFunc() // 접근 허용
    }
}
