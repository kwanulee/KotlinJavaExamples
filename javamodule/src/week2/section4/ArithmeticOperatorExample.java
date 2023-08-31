package week2.section4;

import java.util.Scanner;

/**
 * 산술연산자의 예제 코드
 */
public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("초단위의 정수를 입력하시오> ");
        int input = scanner.nextInt();        // 정수입력

		int hours = input / 60 / 60;        // 시간
		int minutes = input / 60 % 60;      // 나머지 분
		int seconds = input % 60;           // 나머지 초

        System.out.printf("%d초는 %d시간 %d분 %d초 입니다.",
                input, hours, minutes, seconds);
    }
}
