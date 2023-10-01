package week6.section2


class Person(var name: String, var age: Int)

fun main() {
    val p1 = Person("Kildong", 30)

    p1.name = "Dooly"
    println(p1.name)
}

