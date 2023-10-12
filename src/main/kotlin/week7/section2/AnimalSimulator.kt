package week7.section2

open class Animal (protected var type: String,
                   protected var name: String,
                   protected val age: Int){

    fun eat() = println("${age}세의 ${type}인 ${name} +(이/가) 식사 중입니다")
    fun sleep() = println("${age}세의 ${type}인 ${name} +(이/가) 잠자는 중입니다")
    fun move() = println("${age}세의 ${type}인 ${name} +(이/가) 이동 중입니다")
}

class Dog(type: String, name: String, age: Int) : Animal(type,name,age) {
    fun bark() = println("${age}세의 ${type}인 ${name} + (이/가) 짖고 있습니다")
}

class Cat(type: String, name: String, age: Int) : Animal(type,name,age) {
    fun meow() = println("${age}세의 ${type}인 ${name} + (이/가) 야옹하고 있습니다")
}

class Duck(type: String, name: String, age: Int) : Animal(type,name,age) {
    fun quack() = println("${age}세의 ${type}인 ${name} + (이/가) 꽥꽥하고 있습니다")
    fun swim() = println("${age}세의 ${type}인 ${name} + (이/가) 수영하고 있습니다")
}

fun main() {
    val aDog = Dog("진도개","화랑",3)
    val bDog = Dog("삼살개","레오",2)

    for (i in 1..5) {
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

    val aCat = Cat("페르시안 고양이", "네로", 3)
    val bCat = Cat("샴 고양이", "나비", 5)

    for (i in 1..5) {
        val catChoice = (Math.random() * 2 + 1).toInt()
        val cat = if (catChoice == 1) aCat else bCat
        val catAction = (Math.random() * 4 + 1).toInt()
        when (catAction) {
            1 -> cat.meow()
            2 -> cat.eat()
            3 -> cat.sleep()
            4 -> cat.move()
        }
    }

    val aDuck = Duck("집오리", "도널드",2)
    val bDuck = Duck("청둥오리", "하늘",2)

    for (i in 1..5) {
        val duckChoice = (Math.random() * 2 + 1).toInt()
        val duck = if (duckChoice == 1) aDuck else bDuck
        val duckAction = (Math.random() * 5 + 1).toInt()
        when (duckAction) {
            1 -> duck.quack()
            2 -> duck.eat()
            3 -> duck.sleep()
            4 -> duck.move()
            5 -> duck.swim()
        }
    }
}