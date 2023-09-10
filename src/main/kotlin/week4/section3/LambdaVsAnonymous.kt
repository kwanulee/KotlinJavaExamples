package week4.section3

fun main() {
    greet()
    greet2()
    greet3()
    greet2()()
}

fun greet() {
    println("Hello from greet1")
}

fun greet2() = {
    println("Hello from greet2")
}

val greet3 = {
    println("Hello from greet3")
}