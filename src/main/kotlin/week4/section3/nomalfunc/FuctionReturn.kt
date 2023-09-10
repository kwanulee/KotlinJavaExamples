package week4.section3.nomalfunc

fun main() {
    println("start of retFunc")
    applyReference(3, 3, ::printSum)
    applyReference(13, 3, ::printSum)
    applyReference(7, 3, ::printSum)
    println("end of retFunc")
}

fun applyReference(a:Int, b:Int, op:(Int, Int)->Unit ) : Unit = op(a,b)

fun printSum(a:Int, b:Int) {
    val result = a+b
    if (result>10) return     // 10보다 크면 결과를 출력하지 않음
    println("result:$result")
}
