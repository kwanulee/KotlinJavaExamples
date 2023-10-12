package week7.section1;

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
public class DogSimulator {
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
    }
}

