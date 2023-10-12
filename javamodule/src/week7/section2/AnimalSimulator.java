package week7.section2;

public class AnimalSimulator {
    public static void main(String[] args) {
        Dog aDog = new Dog("진도개", "화랑", 3);
        Dog bDog = new Dog("삼살개", "레오", 2);

        for (int i = 1; i <= 5; ++i) {
            int dogChoice = (int) (Math.random() * 2 + 1);
            Dog dog;
            if (dogChoice == 1)
                dog = aDog;
            else dog = bDog;
            int dogAction = (int) (Math.random() * 4 + 1);
            switch (dogAction) {
                case 1:
                    dog.bark();
                    break;
                case 2:
                    dog.eat();
                    break;
                case 3:
                    dog.sleep();
                    break;
                case 4:
                    dog.move();
                    break;
            }
        }

        Cat aCat = new Cat("페르시안 고양이", "네로", 3);
        Cat bCat = new Cat("샴 고양이", "나비", 5);

        for (int i = 1; i <= 5; ++i) {
            int catChoice = (int) (Math.random() * 2 + 1);
            Cat cat;
            if (catChoice == 1)
                cat = aCat;
            else cat = bCat;
            int catAction = (int) (Math.random() * 4 + 1);
            switch (catAction) {
                case 1:
                    cat.meow();
                    break;
                case 2:
                    cat.eat();
                    break;
                case 3:
                    cat.sleep();
                    break;
                case 4:
                    cat.move();
                    break;
            }
        }
        Duck aDuck = new Duck("집오리", "도널드",2);
        Duck bDuck = new Duck("청둥오리", "하늘",2);

        for (int i = 1; i <= 5; ++i) {
            int duckChoice = (int) (Math.random() * 2 + 1);
            Duck duck;
            if (duckChoice == 1)
                duck = aDuck;
            else duck = bDuck;
            int duckAction = (int) (Math.random() * 5 + 1);
            switch (duckAction) {
                case 1:
                    duck.quack();
                    break;
                case 2:
                    duck.eat();
                    break;
                case 3:
                    duck.sleep();
                    break;
                case 4:
                    duck.move();
                    break;
                case 5:
                    duck.swim();
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