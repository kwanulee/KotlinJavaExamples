package week3.section3;

import java.util.function.Supplier;

public class CallByValue {
    public static void main(String[] args) {
        Supplier<Boolean> lambda = () -> {
            System.out.println("lambda function");
            return true; // 마지막 표현식 문장의 결과가 반환
        };

        boolean result = callByValue(lambda.get()); // Supplier 인터페이스의 get()함수 호출
        System.out.println(result);
    }

    public static boolean callByValue(boolean b) { // 일반 변수 자료형으로 선언된 매개변수
        System.out.println("callByValue function");
        return b;
    }
}
