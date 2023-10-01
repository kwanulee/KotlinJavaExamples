package week6.section1.defaultVisibility.otherPackage;

import week6.section1.defaultVisibility.DefaultMemberJavaClass;
import week6.section1.publicVisibility.PublicClass;

class OtherClass {
    DefaultMemberJavaClass dc = new DefaultMemberJavaClass();
    PublicClass dmkc = new PublicClass();

    void test() {
        //dc.i = 1;         // 접근 불가
        //dc.defaultFunc(); // 접근 불가

     //   dmkc.i = 2;
        dmkc.publicFunc();
    }
}
