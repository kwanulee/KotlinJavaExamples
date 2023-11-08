package week10.section4

import java.util.*

fun main() {
    // java.util.HashMap의 사용
    val hashMap: HashMap<Int, String> = hashMapOf(3 to "kwlee", 2 to "World",  1 to "Hello" )
    println("hashMap = $hashMap")

    // java.util.SortedMap 사용
    val sortedMap: SortedMap<Int, String> = sortedMapOf(3 to "Abc", 1 to "Apple", 2 to "Banana")
    println("sortedMap = $sortedMap")

    // java.util.LinkedHashMap의 사용
    val linkedHash: LinkedHashMap<Int, String> = linkedMapOf(2 to "Mouse", 1 to "Computer")
    println("linkedHash = $linkedHash")
}