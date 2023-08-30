package week2.section3

fun main() {
    val str = "GeeksforGeeks"

    if(str is String) { // 자료형 검사
        println("length of String "
                + str.length) // 스마트 캐스트
    }
}