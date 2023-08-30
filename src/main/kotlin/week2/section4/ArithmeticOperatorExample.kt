package week2.section4

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("초단위의 정수를 입력하시오> ")
    val input = scanner.nextInt() // 정수입력

    val hours = input / 60 / 60
    val minutes = input / 60 % 60
    val seconds = input % 60

    print("${input}초는 ${hours}시간 ${minutes}분 ${seconds}초 입니다.")
}