package week5.section3.mutlipeconstructor;

public class Dog {
    String type;
    String name;
    int age;

    Dog() {
        type = "Dog";
        name = "noName";
        age = 0;
    }

    Dog(String type, String name, int age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }
    void bark() {
        System.out.println(name+"(이/가)  짖고 있습니다.");
    }
    void eat() {
        System.out.println(name+"(이/가) 식사 중입니다.");
    }

    public static void main(String[] args) {
        System.out.println("객체생성 요청: Dog(\"진도개\",\"화랑\",3)");
        Dog aDog = new Dog("진도개","화랑",3);
        System.out.println("종류= " + aDog.type);
        System.out.println("이름= " + aDog.name);
        System.out.println("나이= " + aDog.age);

        System.out.println("\n객체생성 요청: Dog(\"진도개2\",null,100)");
        Dog bDog = new Dog("진도개2",null,100);
        System.out.println("종류= " + aDog.type);
        System.out.println("이름= " + aDog.name);
        System.out.println("나이= " + aDog.age);

    }
}