package week8.section2.interface2;

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
                    if (animal instanceof  Speakable)
                        ((Speakable)animal).speak();
                    break;
                case 2:
                    animal.eat();
                    break;
                case 3:
                    animal.sleep();
                    break;
                case 4:
                    if (animal instanceof Movable)
                        ((Movable)animal).move();
                    break;
                case 5:
                    if (animal instanceof  Swimmable)
                        ((Swimmable)animal).swim();
                    break;
            }
        }
    }
}

interface Animal {


    String getType();
    String getName();

    int getAge();

    default void eat() {
        System.out.println(getAge() + "세의 " + getType() + "인 " + getName() + "(이/가) 식사 중입니다");
    }

    default void sleep() {
        System.out.println(getAge() + "세의 " + getType() + "인 " + getName() + "(이/가) 잠자는 중입니다");
    }


}

interface Speakable {
    void speak();
}

interface Movable extends Animal{
    default void move() {
        System.out.println(getAge() + "세의 " + getType() + "인 " + getName() + "(이/가) 이동 중입니다");
    }
}
interface Swimmable extends Animal{
    default void swim() {
        System.out.println(getAge() + "세의 " + getType() + "인 " + getName() + "(이/가) 수영 중입니다");
    }
}

class Dog  implements Movable, Speakable{
    private String type;
    private String name;
    private int age;

    public Dog(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println(getAge() + "세의 " + getType() + "인 " + getName() +  "(이/가) 짖고 있습니다");
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Cat implements Movable, Speakable {
    private String type;
    private String name;
    private int age;

    public Cat(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println(age+"세의 " +type+ "인 "+name +  "(이/가) 야옹하고 있습니다");
    }

        @Override
        public int getAge() { return age; }

        @Override
        public String getType() { return type; }

        @Override
        public String getName() { return name;}
}

class Duck implements Movable, Speakable,Swimmable {
    private String type;
    private String name;
    private int age;

    public Duck(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println(age+"세의 " +type+ "인 "+name +  "(이/가) 꽥꽥하고 있습니다");
    }
    @Override
    public int getAge() { return age; }

    @Override
    public String getType() { return type; }

    @Override
    public String getName() { return name;}
}

class Fish implements Swimmable {
    private String type;
    private String name;
    private int age;

    public Fish(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }
    @Override
    public int getAge() { return age; }

    @Override
    public String getType() { return type; }

    @Override
    public String getName() { return name;}
}