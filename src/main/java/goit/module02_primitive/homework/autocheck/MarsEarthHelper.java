package goit.module02_primitive.homework.autocheck;

public class MarsEarthHelper {
    private float count;

    public int convertAppleCount(float count) {
        /*
        int result = (int)count;
        return result;
         */
        return (int) count;
    }
    public byte countAppleCount(int garden1Count, int garden2Count) {
        //return (byte) ((byte) garden1Count + (byte) garden2Count);
        return (byte) (garden1Count + garden2Count);
    }
    public float calculateTotalAppleWeight(double treeAge) {
        return (float) (treeAge * 9.18f);
    }

    public static void main(String[] args) {
        MarsEarthHelper helper = new MarsEarthHelper();
        System.out.println("convertAppleCount(10f) = " + helper.convertAppleCount(10f));
        System.out.println("convertAppleCount(3.4f) = " + helper.convertAppleCount(3.4f));
        System.out.println("convertAppleCount(10.99f) = " + helper.convertAppleCount(10.99f));
        System.out.println("countAppleCount(10, 7) = " + helper.countAppleCount(10, 7));
        System.out.println("countAppleCount(10, 30) = " + helper.countAppleCount(10, 30));
        System.out.println("countAppleCount(50, 1) = " + helper.countAppleCount(50, 1));
        System.out.println("calculateTotalAppleWeight(1) = " + helper.calculateTotalAppleWeight(1));
    }
}