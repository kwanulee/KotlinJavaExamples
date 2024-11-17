package week10.section2

import java.util.*


fun main() {
    var title = "  Welcome to Kotlin"

    println(title)
    println(title + "\nChapter1")
    println(title[1])
    println(title.lowercase(Locale.getDefault()))
    println(title.uppercase(Locale.getDefault()))
    println(title.trim())

    var deli = "Welcome to Kotlin"
    val sp = deli.split(" ")
    println(sp)
}