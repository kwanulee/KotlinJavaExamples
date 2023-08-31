package week2.section3;

public class TypeChecking {
    public static void main(String[] args) {
        Object ob = "GeeksforGeeks";

        if(ob instanceof String) {
            String str = (String) ob;  // 명시적 형변환

            System.out.println("length of String " +
                    str.length());
        }
    }
}
