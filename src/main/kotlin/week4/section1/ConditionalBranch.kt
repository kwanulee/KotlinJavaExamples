package week4.section1

fun main() {
    val x = 6

    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("기타")
    }

    when (x) {
        in 1..10 -> println("x는 1 이상 10 이하입니다.")
        !in 10..20 -> println("x는 10 이상 20 이하의 범위에 포함되지 않습니다.")
        else -> println("x는 어떤 범위에도 없습니다.")
    }

    val str = "안녕하세요."
    val result = when (str) {
        is String -> "문자열입니다."
        else -> false
    }
}