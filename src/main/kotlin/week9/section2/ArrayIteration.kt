package week9.section2

import java.util.*

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5) // 다섯개로 고정된 배열

// forEach에 의한 요소 순환
    arr.forEach { element -> print("$element ") }
    println()

// forEachIndexed에 의한 요소 순환
    arr.forEachIndexed({ i, e -> println("arr[$i] = $e") })

// Iterator를 사용한 요소 순환
    val iter: Iterator<Int> = arr.iterator()
    while(iter.hasNext()) {
        val e = iter.next()
        print("$e ")
    }

}