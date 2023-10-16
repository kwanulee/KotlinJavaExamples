package week7.section1.derivedWithMainCons

open class Animal (var type: String, val name: String, val age: Int){
    fun eat() = println("${age}세의 ${type}인 ${name} (이/가) 식사 중입니다")
    fun sleep() = println("${age}세의 ${type}인 ${name} (이/가) 잠자는 중입니다")
    fun move() = println("${age}세의 ${type}인 ${name} (이/가) 이동 중입니다")
}

class Dog(type: String, name: String, age: Int) : Animal(type,name,age) {

    constructor(type:String, age:Int) : this (type,"noName",age)
    fun bark() = println("${age}세의 ${type}인 ${name} (이/가) 짖고 있습니다")
}

fun main() {
    val aDog = Dog("진도개","화랑",3)
    val bDog = Dog("삼살개","레오",2)

    for (i in 1..10) {
        val dogChoice = (Math.random() * 2 + 1).toInt()
        val dog = if (dogChoice == 1) aDog else bDog
        val dogAction = (Math.random() * 4 + 1).toInt()
        when (dogAction) {
            1 -> dog.bark()
            2 -> dog.eat()
            3 -> dog.sleep()
            4 -> dog.move()
        }
    }
}


