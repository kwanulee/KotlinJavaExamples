package week9.section2

fun main() {
    val numbers = arrayOf(4,5,6,7)
    for (element in numbers)
        println(element)

    val numArray = Array(5, {i-> i*2})
    for (element in numArray)
        println(element)

}