package week8.section2.abstractClass;

public class AnimalSimulator {
    public static void main(String[] args) {
        Dog aDog = new Dog("진도개", "화랑", 3);
        Dog bDog = new Dog("삼살개", "레오", 2);
        Cat aCat = new Cat("페르시안 고양이", "네로", 3);
        Cat bCat = new Cat("샴 고양이", "나비", 5);
        Duck aDuck = new Duck("집오리", "도널드",2);
        Duck bDuck = new Duck("청둥오리", "하늘",2);

        for (int i = 1; i <= 5; ++i) {
            int animalChoice = (int) (Math.random() * 2 + 1);
            Animal animal;
            if (animalChoice == 1)
                animal = aDuck;
            else animal = bDuck;
            int animalAction = (int) (Math.random() * 5 + 1);
            switch (animalAction) {
                case 1:
                    animal.speak();
                    break;
                case 2:
                    animal.eat();
                    break;
                case 3:
                    animal.sleep();
                    break;
                case 4:
                    animal.move();
                    break;
                case 5:
                    if (animal instanceof  Duck ||
                        animal instanceof  Fish)
                        ((Duck)animal).swim();
                    break;
            }
        }
    }
}

abstract class Animal {
    protected String type;
    protected String name;
    protected int age;

    public Animal(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(age + "세의 " + type + "인 " + name + "(이/가) 식사 중입니다");
    }

    public void sleep() {
        System.out.println(age + "세의 " + type + "인 " + name + "(이/가) 잠자는 중입니다");
    }

    public void move() {
        System.out.println(age + "세의 " + type + "인 " + name + "(이/가) 이동 중입니다");
    }
    abstract public void speak();
}

class Dog extends Animal {
    public Dog(String type, String name, int age) {
        super(type, name, age);
    }

    public void speak() {
        System.out.println(age+"세의 " +type+ "인 "+name +  "(이/가) 짖고 있습니다");
    }
}

class Cat extends Animal {
    public Cat(String type, String name, int age) {
        super(type, name, age);
    }

    public void speak() {
        System.out.println(age+"세의 " +type+ "인 "+name +  "(이/가) 야옹하고 있습니다");
    }
}

class Duck extends Animal {
    public Duck(String type, String name, int age) {
        super(type, name, age);
    }

    public void speak() {
        System.out.println(age+"세의 " +type+ "인 "+name +  "(이/가) 꽥꽥하고 있습니다");
    }
    public void swim() {
        System.out.println(age+"세의 " +type+ "인 "+name +  "(이/가) 수영하고 있습니다");
    }
}

class Fish extends Animal {
    public Fish(String type, String name, int age) {
        super(type, name, age);
    }

    public void speak() {} // Fish는 아무 말을 하지 못하므로, 아무것도 안하도록 재정의
    public void move() {} // Fish는 육상에서 이동하지 못하므로, 아무것도 안하도록 재정의
    public void swim() {
        System.out.println(age+"세의 " +type+ "인 "+name +  "(이/가) 수영하고 있습니다");
    }

}