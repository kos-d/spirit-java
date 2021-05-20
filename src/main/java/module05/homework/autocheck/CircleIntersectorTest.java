package module05.homework.autocheck;
import static java.lang.Math.*;
public class CircleIntersectorTest {
    public static void main(String[] args) {
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}
class CircleIntersector {
    private int x1, y1, r1;
    private int x2, y2, r2;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        this.x1 = x1;
        this.y1 = y1;
        this.r1 = r1;
        this.x2 = x2;
        this.y2 = y2;
        this.r2 = r2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getR1() {
        return r1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public int getR2() {
        return r2;
    }

    @Override
    public String toString() {
        double dist = (sqrt(pow(getX2() - getX1(), 2) + pow(getY2() - getY1(), 2)));
        if (dist <= (getR2() + getR1())) {
            return "intersects";
        } else {
            return "not intersects";
        }
    }
}
