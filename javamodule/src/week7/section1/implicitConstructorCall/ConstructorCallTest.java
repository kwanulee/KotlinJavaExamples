package week7.section1.implicitConstructorCall;

public class ConstructorCallTest {
    public static void main(String[] args) {
        B b1 = new B();
        B b2 = new B(5);
    }
}

class A {
    A() {
        System.out.println("생성자 A : no parameter");
    }

    A(int x) {
        System.out.println("생성자 A  with  parameter x");
    }
}

class B extends A {
    B() {
        System.out.println("생성자 B  with  no parameter");
    }

    B(int x) {
        System.out.println("생성자 B with  parameter x");
    }

}