package goit.module05.homework.autocheck;

import static java.lang.Math.*;

public class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        System.out.println(new RectangleArea(coords).getArea());
    }
}
class RectangleArea {
    private int[] coords = new int[4];
    public RectangleArea(int[] coords) {
        this.coords[0] = coords[0];
        this.coords[1] = coords[1];
        this.coords[2] = coords[2];
        this.coords[3] = coords[3];
    }
    public int getArea() {

        int sideA = (int) round(sqrt(pow(coords[2] - coords[0], 2)));
        int sideB = (int) round(sqrt(pow(coords[3] - coords[1], 2)));
        int square = sideA * sideB;
        return square;
    }
}