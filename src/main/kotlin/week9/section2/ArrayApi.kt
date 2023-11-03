package week9.section2

import java.util.*

fun main() {
    val arr = intArrayOf(1, 2, 3, 4, 5) // 다섯개로 고정된 배열

// 하나의 요소를 추가한 새 배열 생성
    val arr2 = arr.plus(6)
    println("arr2: ${Arrays.toString(arr2)}")

// 필요한 범위를 잘라내 새 배열 생성
    val arr3 = arr.sliceArray(0..2) // 인자에 잘라낼 인덱스의 범위를 지정
    println("arr3: ${Arrays.toString(arr3)}")

// 첫 번째와 마지막 요소 확인
    println(arr.first())
    println(arr.last())

// 요소 3의 인덱스 출력
    println("indexOf(3): ${arr.indexOf(3)}")

// 배열의 평균 값 출력
    println("average: ${arr.average()}")

// count에 의한 요소 개수
    println("count: ${arr.count()}")

// forEach에 의한 요소 순환
    arr.forEach { element -> print("$element ") }

// forEachIndexed에 의한 요소 순환
    arr.forEachIndexed({ i, e -> println("arr[$i] = $e") })

}