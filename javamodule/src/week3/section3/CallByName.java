package week3.section3;

import java.util.function.Supplier;

public class CallByName {
    public static void main(String[] args) {
        Supplier<Boolean> otherLambda = () -> {
            System.out.println("otherLambda function");
            return true;
        };

        boolean result = callByName(otherLambda); // Supplier 인터페이스 객체 전달
        System.out.println(result);
    }

    public static boolean callByName(Supplier<Boolean> b) {
        System.out.println("callByName function");
        return b.get();
    }
}
