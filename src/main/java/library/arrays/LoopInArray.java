package library.arrays;

public class LoopInArray {
    public static void main(String[] args) {
        int[] array = { 1, 3, 5, 11 };
        
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println("");
        byte[] bArray = { -128, -3, -2, 0 , 1, 4, 127 };
        
        for (byte b : bArray) {
            System.out.printf("%d ", b);
        }
    }
}