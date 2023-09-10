package week4.section1

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("정수를 입력하시오: ")
    val number1: Int = sc.nextInt()
    if (number1 > 0) {
        println("양수입니다.")
    } else if (number1 == 0) {
        println("0입니다.")
    } else {
        println("음수입니다.")
    }
}