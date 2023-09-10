package week4.section3.anonymous

fun main() {
    println("start of retFunc")
    applyLambda(3, 3, printSum)
    applyLambda(13, 3, printSum)
    applyLambda(7, 3, printSum)
    println("end of retFunc")
}

fun applyLambda(a:Int, b:Int, op:(Int, Int)->Unit ) : Unit = op(a,b)

// 익명 함수 (Anonymous Function)
val printSum = fun(a:Int, b:Int)  {
    val result = a+b
    if (result>10) return     // 10보다 크면 결과를 출력하지 않음
    println("result:$result") }