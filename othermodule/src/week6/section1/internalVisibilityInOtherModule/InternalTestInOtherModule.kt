package week6.section1.internalVisibilityInOtherModule

import week6.section1.internalVisibility.InternalClass

fun main() {
    val icInOtherModule = InternalClass()   // 접근 불가
    //icInOtherModule.access()
}