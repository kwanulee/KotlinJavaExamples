package week9.section2

import java.util.*

fun main() {
    // 0보다 큰 수 골라내기
    val arr = arrayOf(1, -2, 3, 4, -5, 0)
    arr.filter { e -> e > 0 }.forEach { e -> print("$e ") }
    println()

    // a로 시작하는 요소 골라내기
    val fruits = arrayOf("banana", "avocado", "apple", "kiwi")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.uppercase(Locale.getDefault()) }
            .forEach { println(it) }

    when {
        "apple" in fruits -> println("Apple!")
    }
}