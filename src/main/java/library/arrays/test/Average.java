package library.arrays.test;

public class Average {
    public static void main(String[] args) {
//        byte[] nums = { -128, -2, 0, 3, 1, 127 };
        double[] nums = { 10.1, 10.2, 10.3 };
        double result = 0;
        
        int i;
        for (i = 0; i < 3; i++) {
            result = result + nums[i];
            System.out.println("Average value: " + result);
        }
    }
}