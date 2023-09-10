package week4.section1;

public class ConditionalBranch {
    public static void main(String[] args) {
        int x = 6;
        switch (x) {
            case 0, 1 -> System.out.println("x == 0 or x == 1");
            default -> System.out.println("기타");
        }

        switch (x) {
            case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> System.out.println("x는 1 이상 10 이하입니다.");
            default -> {
                if (!(x >= 10 && x <= 20)) {
                    System.out.println("x는 10 이상 20 이하의 범위에 포함되지 않습니다.");
                } else {
                    System.out.println("x는 어떤 범위에도 없습니다.");
                }
            }
        }

        String str = "안녕하세요.";
        Object result;
        if (str instanceof String) {
            result = "문자열입니다.";
        } else {
            result = false;
        }
    }
}
