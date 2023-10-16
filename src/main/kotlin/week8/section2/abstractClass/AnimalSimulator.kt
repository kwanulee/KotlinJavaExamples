package week8.section2.abstractClass


abstract class Animal(
    protected var name: String,
    protected val age: Int
) {
    abstract protected val type: String

    fun eat() = println("${age}세의 ${type}인 ${name} (이/가) 식사 중입니다")
    fun sleep() = println("${age}세의 ${type}인 ${name} (이/가) 잠자는 중입니다")
    open fun move() = println("${age}세의 ${type}인 ${name} (이/가) 이동 중입니다")

    abstract fun speak()
}

class Dog(override val type: String, name: String, age: Int) : Animal(name, age) {
    override fun speak() = println("${age}세의 ${type}인 ${name} (이/가) 짖고 있습니다")
}

class Cat(override val type: String, name: String, age: Int) : Animal(name, age) {
    override fun speak() = println("${age}세의 ${type}인 ${name} (이/가) 야옹하고 있습니다")
}

class Duck(override val type: String, name: String, age: Int) : Animal(name, age) {
    override fun speak() = println("${age}세의 ${type}인 ${name} (이/가) 꽥꽥하고 있습니다")
    fun swim() = println("${age}세의 ${type}인 ${name}  (이/가) 수영하고 있습니다")
}

class Fish(override val type: String, name: String, age: Int) : Animal(name, age) {


    override fun speak() {} // Fish는 말을 하지 못하므로, 아무것도 안하도록 재정의
    override fun move() {} // Fish는 육상에서 이동하지 못하므로, 아무것도 안하도록 재정의

    // swim() 구현이 Duck의 swim() 구현과 중복됨
    fun swim() = println("${age}세의 ${type}인 ${name} (이/가) 수영하고 있습니다")
}

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
            1 -> animal.speak()
            2 -> animal.eat()
            3 -> animal.sleep()
            4 -> animal.move()
            5 -> if (animal is Fish)
                    animal.swim()
                 else if (animal is Duck)
                     animal.swim()
        }
    }
}