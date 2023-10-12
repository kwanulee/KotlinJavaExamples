package week7.section2.updowncasting

open class Animal(
    protected var type: String,
    protected var name: String,
    protected val age: Int
) {

    fun eat() = println("${age}세의 ${type}인 ${name} +(이/가) 식사 중입니다")
    fun sleep() = println("${age}세의 ${type}인 ${name} +(이/가) 잠자는 중입니다")
    fun move() = println("${age}세의 ${type}인 ${name} +(이/가) 이동 중입니다")
}

class Dog(type: String, name: String, age: Int) : Animal(type, name, age) {
    fun bark() = println("${age}세의 ${type}인 ${name} + (이/가) 짖고 있습니다")
}

class Cat(type: String, name: String, age: Int) : Animal(type, name, age) {
    fun meow() = println("${age}세의 ${type}인 ${name} + (이/가) 야옹하고 있습니다")
}

class Duck(type: String, name: String, age: Int) : Animal(type,name,age) {
    fun quack() = println("${age}세의 ${type}인 ${name} + (이/가) 꽥꽥하고 있습니다")
    fun swim() = println("${age}세의 ${type}인 ${name} + (이/가) 수영하고 있습니다")
}

fun main() {
    val aDog = Dog("진도개", "화랑", 3)
    val bDog = Dog("삼살개", "레오", 2)
    val aCat = Cat("페르시안 고양이", "네로", 3)
    val bCat = Cat("샴 고양이", "나비", 5)
    val aDuck = Duck("집오리", "도널드",2)
    val bDuck = Duck("청둥오리", "하늘",2)

    for (i in 1..5) {
        val animalChoice = (Math.random() * 6 + 1).toInt()
        val animal = when (animalChoice) { // upcasting
            1 -> aDog
            2 -> bDog
            3 -> aCat
            4 -> bCat
            5 -> aDuck
            else -> bDuck
        }
        val animalAction = (Math.random() * 5 + 1).toInt()

        when (animalAction) {
            1 -> if (animal is Dog)     // downcasting
                    animal.bark()
                else if (animal is Cat)
                    animal.meow()
                else if (animal is Duck)
                    animal.quack()
            2 -> animal.eat()
            3 -> animal.sleep()
            4 -> animal.move()
            5 -> if (animal is Duck)
                    animal.swim()
        }
    }
}