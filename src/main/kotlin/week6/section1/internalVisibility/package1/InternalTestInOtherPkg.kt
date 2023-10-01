package week6.section1.internalVisibility.package1

import week6.section1.internalVisibility.InternalClass

fun main() {
    val icInOtherPkg = InternalClass()   // 생성가능
    println(icInOtherPkg.i)              // 접근허용
    icInOtherPkg.icFunc()                // 접근허용
}
