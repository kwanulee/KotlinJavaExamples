package week3.section3;

import java.util.function.BiFunction;

public class HighOrderTest2 {
    public static void main(String[] args) {
        int result;

        // 람다식을 매개변수와 인자로 사용한 함수
        result = highOrder((x, y) -> x + y, 10, 20);
        System.out.println(result);
    }

    public static int highOrder(BiFunction<Integer, Integer, Integer> sum, int a, int b) {
        return sum.apply(a, b);
    }
}
