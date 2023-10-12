package week7.section2.updowncasting;

public class AnimalSimulator {
    public static void main(String[] args) {
        Dog aDog = new Dog("진도개", "화랑", 3);
        Dog bDog = new Dog("삼살개", "레오", 2);
        Cat aCat = new Cat("페르시안 고양이", "네로", 3);
        Cat bCat = new Cat("샴 고양이", "나비", 5);
        Duck aDuck = new Duck("집오리", "도널드",2);
        Duck bDuck = new Duck("청둥오리", "하늘",2);

        for (int i = 1; i <= 5; ++i) {
            int animalChoice = (int) (Math.random() * 6 + 1);
            Animal animal;
            switch (animalChoice) {
                case 1: animal = aDog; break;
                case 2: animal = bDog; break;
                case 3: animal = aCat; break;
                case 4: animal = bCat; break;
                case 5: animal = aDuck; break;
                default: animal = bDuck; break;
            }
            int animalAction = (int) (Math.random() * 5 + 1);
            switch (animalAction) {
                case 1:
                    if (animal instanceof Dog)
                        ((Dog)animal).bark();
                    else if (animal instanceof  Cat)
                        ((Cat)animal).meow();
                    else if (animal instanceof  Duck)
                        ((Duck)animal).quack();
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
                    if (animal instanceof Duck)
                        ((Duck)animal).swim();
                    break;
            }
        }

    }
}

class Animal {
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
}

class Dog extends Animal {
    public Dog(String type, String name, int age) {
        super(type, name, age);
    }

    public void bark() {
        System.out.println(age+"세의 " +type+ "인 "+name +  "(이/가) 짖고 있습니다");
    }
}

class Cat extends Animal {
    public Cat(String type, String name, int age) {
        super(type, name, age);
    }

    public void meow() {
        System.out.println(age+"세의 " +type+ "인 "+name +  "(이/가) 야옹하고 있습니다");
    }
}

class Duck extends Animal {
    public Duck(String type, String name, int age) {
        super(type, name, age);
    }

    public void quack() {
        System.out.println(age+"세의 " +type+ "인 "+name +  "(이/가) 꽥꽥하고 있습니다");
    }
    public void swim() {
        System.out.println(age+"세의 " +type+ "인 "+name +  "(이/가) 수영하고 있습니다");
    }
}