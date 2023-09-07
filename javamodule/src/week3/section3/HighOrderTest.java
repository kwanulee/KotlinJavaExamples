package week3.section3;

import java.util.function.BiFunction;

public class HighOrderTest {
    public static void main(String[] args) {
        int result;

        // 1. 일반 변수에 람다식 할당 ((1)~(2)의 선언은 모두 같음)
        //   BiFunction<Integer, Integer, Integer> multi = (x, y) -> x * y; // (1) 람다식 선언에만 자료형 지정
        BiFunction<Integer, Integer, Integer> multi = (Integer x, Integer y) -> x * y; // (2) 람다식, 선언부 자료형 지정

        // 람다식 본문이 여러 줄인 경우
        BiFunction<Integer, Integer, Integer> multi2 = (x, y) -> {
            System.out.println("x * y");
            return x * y; // 마지막 표현식이 반환됨
        };

        // 람다식이 할당된 변수는 함수처럼 사용 가능
        result = multi.apply(10, 20);
        System.out.println(result);
        System.out.println(multi2.apply(10, 20));
    }
}
