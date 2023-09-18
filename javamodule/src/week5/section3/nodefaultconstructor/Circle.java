package week5.section3.nodefaultconstructor;

public class Circle {
    int radius;
    void set(int r) { radius = r; }
    double getArea() { return 3.14*radius*radius; }

    public Circle(int r) {
        radius = r;
    }

    public static void main(String[] args) {
        Circle pizza = new Circle(10);
        System.out.println(pizza.getArea());

       // Circle donut = new Circle();        // 컴파일 오류
       // System.out.println(donut.getArea());
    }
}
