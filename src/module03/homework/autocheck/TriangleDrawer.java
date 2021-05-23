package module03.homework.autocheck;

public class TriangleDrawer {
    public String drawTriangle(int side) {
        String result = "";
        int sideA = 0;
        int sideB = 0;

        while (sideA < side) {
            int sideC = sideB;
            sideB++;
            while (sideC < side) {
                result = result + "*";
                sideC++;
            }
            result = result + "\n";
            sideA++;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(new TriangleDrawer().drawTriangle(3));

        //System.out.println("*".repeat(3));
    }
}
