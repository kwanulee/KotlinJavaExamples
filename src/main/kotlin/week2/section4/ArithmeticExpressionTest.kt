package week2.section4

fun main() {
    print("10+3=")
    println(10 + 3)

    print("5.21+3.1=")
    println(5.21 + 3.1)

    println("5+3.1=" + (5 + 3.1))

    println("5/2=" + 5 / 2)
    println("5/2.0=" + 5 / 2.0)

    println("365의 100의 자리수=" + 365 / 100)
    println("365의 10의 자리수=" + 365 % 100 / 10)
    println("365의 1의 자리수=" + 365 % 10)

    println("365 % 2 =" + 365 % 2) //1이면 홀수, 0이면 짝수

    println("366 % 3 =" + 366 % 3) // 0이면 3의 배수,
}