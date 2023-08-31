package week2.section1;

public class UserClassImport {
    public static void main(String[] args) {
        com.example.edu.Person user1 = new com.example.edu.Person("Kildong", 30); // com.example.edu의 Person이 User로 대체
        Person user2 = new Person("A123", "Kildong"); // 이 파일 내에 있는 Person 클래스의 객체 생성

        System.out.println(user1.name);
        System.out.println(user1.age);

        System.out.println(user2.id);
        System.out.println(user2.name);
    }
}

class Person {
    String id;
    String name;

    Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
