package week3.section3;

public class HighOrderTest3 {
    public static void main(String[] args) {
        // 반환값이 없는 람다식의 선언을 java.lang.Runnable과 같은 함수형 인터페이스로 변환
        Runnable out = () -> System.out.println("Hello World!");

        out.run(); // 인터페이스의 run메소드로 실행
        Runnable newRunnable = out; // 람다식이 변환된 인터페이스 변수를 다른 변수에 할당
        newRunnable.run();
    }
}
