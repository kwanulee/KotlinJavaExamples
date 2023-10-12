package week7.section1.PB

import week7.section1.PA.A

class B : A(){
    fun set() {
        pub = 1
     //   pri = 2   // 접근할수 없음
     //   inter = 3 // 접근할수 없음
        pro = 4
    }
}