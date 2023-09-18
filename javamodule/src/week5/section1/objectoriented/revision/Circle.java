package week5.section1.objectoriented.revision;

public class Circle {
    final String shape = "CIRCLE";
    final String sound = "circle.aif";

    void rotate() {
        System.out.println("도형의 중심을 기준으로 360도 회전:"+shape);
    }

    void playSound() {
        System.out.println("AIF 사운드 재생:"+sound);
    }
}
