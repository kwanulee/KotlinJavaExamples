package week7.section1;

public class ColorPointTest {


    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(2, 3, "RED");
        cp.showColorPoint();
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void showPoint() {
        System.out.printf("(%d,%d)\n", x, y);
    }
}

class ColorPoint extends Point {

    String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    void showColorPoint() {
        showPoint();
        System.out.println("Color:" + color);
    }
}
