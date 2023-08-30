package week2.section4;

public class IncDecOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        int result1 = ++num1; // num 값 증가 후 대입
        int result2 = num2++; // 먼저 num 값 대입 후 증가

        System.out.println("result1: $result1");
        System.out.println("result2: $result2");
        System.out.println("num1: $num1");
        System.out.println("num2: $num2");
    }
}
