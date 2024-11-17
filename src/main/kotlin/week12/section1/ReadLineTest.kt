package week12.section1

import java.util.*

fun main() {
    // 기본 코틀린의 readLine()
    print("Enter: ")
    val input = readln()
    println("You entered: $input")

    // 자바의 Scanner를 통한 입력
    val reader = Scanner(System.`in`) // in은 코틀린의 범위 연산자이므로 `in`
    var integer:Int = reader.nextInt()
    println("You entered: $integer")
}

