package week2.section1;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class MathPackageImport {
    public static void main(String[] args) {
        String intro = "안녕하세요!";
        int num = 20;

        System.out.println(PI);
        System.out.println(abs(-12.6)); // 절댓값을 위해 사용하는 abs( ) 함수

        System.out.println("intro: $intro, num: $num");
    }
}
