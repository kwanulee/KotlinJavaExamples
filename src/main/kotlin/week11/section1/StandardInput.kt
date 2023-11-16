package week11.section1

import java.io.InputStreamReader

fun main() {
    val rd = InputStreamReader(System.`in`)

    while(true) {
        val c = rd.read() // 입력 스트림으로부터 키 입력. c는 입력된 키 문자 값
        print(c.toChar()) // 입력된 키문자 c를 출력
    }
}