package week4.section1

import java.util.*

fun main() {
    val number: Int

    val sc = Scanner(System.`in`)
    print("정수를 입력하시오: ")
    number = sc.nextInt()

    if (number % 2 == 0) {
        println("입력된 정수는 짝수입니다.")
    } else {
        println("입력된 정수는 홀수입니다.")
    }

    println("프로그램이 종료되었습니다. ")
}