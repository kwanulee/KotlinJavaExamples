package week6.section1.defaultVisibility;

public class DefaultMemberJavaClass {
    int i = 1;
    void defaultFunc() {
        i += 1; // 접근 허용
    }
    void access() {
        defaultFunc(); // 접근 허용
    }
}

class OtherClass {
    DefaultMemberJavaClass dc = new DefaultMemberJavaClass();
    void test() {
        dc.i = 1;         // 접근 허용
        dc.defaultFunc(); // 접근 허용
    }
}
