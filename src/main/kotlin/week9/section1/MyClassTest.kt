package week9.section1

class MyClass<T>(val myProp: T) {  // 주생성자 프로퍼티의 자료형에 사용됨
    fun <S>myMethod(a: S) { 		// 메서드의 매개변수 자료형에 사용됨
        println("a=$a")
    }
}

fun main() {
    var a = MyClass<Int>(12)
    println(a.myProp)
    a.myMethod(2)

    var b = MyClass<String>("hello")
    println(b.myProp)
    b.myMethod("world")

}
