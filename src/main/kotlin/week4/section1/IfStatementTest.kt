package week4.section1

import java.util.*


object IfStatmentTest {
    @JvmStatic
    fun main(args: Array<String>) {
        val month: Int

        val sc = Scanner(System.`in`)
        print("월을 입력하시오(1~12):")
        month = sc.nextInt()
        if (month == 1) println("January")
        if (month == 2) println("February")
        if (month == 3) println("March")
        if (month == 4) println("April")
        if (month == 5) println("May")
        if (month == 6) println("June")
        if (month == 7) println("July")
        if (month == 8) println("August")
        if (month == 9) println("September")
        if (month == 10) println("October")
        if (month == 11) println("November")
        if (month == 12) println("December")
    }
}