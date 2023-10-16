package week8.section2.interface2

interface Animal {
    val type: String
    val name: String
    val age: Int

    fun eat() = println("${age}세의 ${type}인 ${name} (이/가) 식사 중입니다")
    fun sleep() = println("${age}세의 ${type}인 ${name} (이/가) 잠자는 중입니다")

}

interface Movable : Animal {
    fun move() = println("${age}세의 ${type}인 ${name} (이/가) 이동 중입니다")
}

interface Swimmable : Animal {
    fun swim() = println("${age}세의 ${type}인 ${name} (이/가) 수영 중입니다.")
}

interface Speakable {
    fun speak()
}

class Dog(
    override val type: String,
    override var name: String,
    override val age: Int
) : Movable, Speakable {
    override fun speak() = println("${age}세의 ${type}인 ${name} (이/가) 짖고 있습니다")
}

class Cat(
    override val type: String,
    override var name: String,
    override val age: Int
) : Movable, Speakable {
    override fun speak() = println("${age}세의 ${type}인 ${name} (이/가) 야옹하고 있습니다")
}

class Duck(
    override val type: String,
    override var name: String,
    override val age: Int
) : Movable, Speakable, Swimmable {
    override fun speak() = println("${age}세의 ${type}인 ${name} (이/가) 꽥꽥하고 있습니다")
}

class Fish(
    override val type: String,
    override var name: String,
    override val age: Int
) : Swimmable


fun main() {
    val aDog = Dog("진도개", "화랑", 3)
    val bDog = Dog("삼살개", "레오", 2)
    val aCat = Cat("페르시안 고양이", "네로", 3)
    val bCat = Cat("샴 고양이", "나비", 5)
    val aDuck = Duck("집오리", "도널드", 2)
    val bDuck = Duck("청둥오리", "하늘", 2)
    val aFish = Fish("금붕어", "다솔", 4)
    for (i in 1..10) {
        val animalChoice = (Math.random() * 7 + 1).toInt()
        val animal = when (animalChoice) { // upcasting
            1 -> aDog
            2 -> bDog
            3 -> aCat
            4 -> bCat
            5 -> aDuck
            6 -> bDuck
            else -> aFish
        }
        val animalAction = (Math.random() * 5 + 1).toInt()

        when (animalAction) {
            1 -> if (animal is Speakable) animal.speak()
            2 -> animal.eat()
            3 -> animal.sleep()
            4 -> if (animal is Movable) animal.move()
            5 -> if (animal is Swimmable) animal.swim()
        }
    }
}