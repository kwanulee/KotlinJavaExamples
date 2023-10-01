package week6.section1.privateVisibility.common;

class PrivateMember {
    private int i = 1;

    private void privateFunc() {
        i += 1; // 접근 허용
    }

    void access() {
        privateFunc(); // 접근 허용
    }
}

public class PrivateMemberTest {
    public static void main(String[] args) {
        PrivateMember pc = new PrivateMember();
        //pc.i; // 접근 불가
        //pc.privateFunc(); // 접근 불가
    }
}
