package week7.section1.derivedWithNoMainCons

import java.lang.Math.random
open class Animal (protected var type: String,
                   protected var name: String,
                   protected val age: Int){

    fun eat() = println("${age}세의 ${type}인 ${name} (이/가) 식사 중입니다")
    fun sleep() = println("${age}세의 ${type}인 ${name} (이/가) 잠자는 중입니다")
    fun move() = println("${age}세의 ${type}인 ${name} (이/가) 이동 중입니다")
}

class Dog : Animal {
    constructor(type:String, age:Int) : this (type,"noName",age)
    constructor(type: String, name: String, age: Int) : super(type,name,age)
    fun bark() = println("${age}세의 ${type}인 ${name} (이/가) 짖고 있습니다")
}

fun main() {
    val aDog = Dog("진도개","화랑",3)
    val bDog = Dog("삼살개","레오",2)

    for (i in 1..5) {
        val dogChoice = (random() * 2 + 1).toInt()
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


