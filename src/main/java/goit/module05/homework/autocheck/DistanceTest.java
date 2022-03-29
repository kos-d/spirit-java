package goit.module05.homework.autocheck;
import java.lang.Math;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class DistanceTest {
    public static void main(String[] args) {
        System.out.println(new Distance(10, 10, 20, 20).getDistance());
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}
class Distance {
    private int startX;
    private int startY;
    private int endX;
    private int endY;
    public int getStartX() {
        return startX;
    }
    public int getStartY() {
        return startY;
    }
    public int getEndX() {
        return endX;
    }
    public int getEndY() {
        return endY;
    }

    public Distance(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }
    public int getDistance() {
        //sqrt(pow((x2 - x1), 2) + pow((y2 - y1), 2));
        return (int) sqrt(pow(getEndX() - getStartX(), 2) + pow(getEndY() - getStartY(), 2 ));

    }
}