package week6.section1.publicVisibilityInOtherModule

import week6.section1.publicVisibility.PublicClass

fun main() {
    var pc = PublicClass()      // 생성가능
    println(pc.i)               // 접근허용
    pc.publicFunc()             // 접근허용
}