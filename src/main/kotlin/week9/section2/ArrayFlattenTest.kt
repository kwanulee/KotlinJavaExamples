package week9.section2

fun main() {
    val numbers = arrayOf(1, 2, 3)
    val strs = arrayOf("one", "two", "three")
    val simpleArray = arrayOf(numbers, strs) // 2차원 배열
  //  simpleArray.forEach { println(it) }
    println(numbers)
    simpleArray.forEach { it.forEach { println(it)} }

    val flattenSimpleArray = simpleArray.flatten() // 단일 배열로 변환하기
    println(flattenSimpleArray)
}