package week8.section1.overloading;

public class OverloadCalc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(3,2));
        System.out.println(calc.add(3.2, 1.3));
        System.out.println(calc.add(3, 3, 2));
        System.out.println(calc.add("Hello", "World"));
    }
}

class Calc {
    // 다양한 매개변수로 오버로딩된 메서드들
    int add(int x, int y) { return x+y; }
    double add(double x, double y) { return x+y; }
    int add(int x, int y, int z) { return x+y+z; }
    String add(String x, String y) { return x.concat(y); }
    //int add(double x, double y) { return (int)(x+y); }
}
