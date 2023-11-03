package week9.section2

import java.util.*

data class Product(val name: String, val price: Double)

fun main() {
    val products = arrayOf(
            Product("Snow Ball", 870.00),
            Product("Smart Phone", 999.00),
            Product("Drone", 240.00),
            Product("Mouse", 333.55),
            Product("Keyboard", 125.99),
            Product("Monitor", 1500.99),
            Product("Tablet", 512.99))

    products.sortBy { it.price }
    products.forEach { println(it) }
    println()

    products.sortBy { it.name }
    products.forEach { println(it) }
    println()
}