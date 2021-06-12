package module03.conspectus.video.lesson03;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] array = new int[4][2];
        
        array[0][0] = 0;
        array[0][1] = 1;
        array[1][0] = 2;
        array[1][1] = 3;
        array[2][0] = 4;
        array[2][1] = 5;        
        array[3][0] = 6;
        array[3][1] = 7;
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Array element " + "[" + i + "]" + "[" + j + "]" + " = " + array[i][j]);
            }
        }
        
        for (int[] element : array) {
            for (int innerElement : element) {
                System.out.println(innerElement);
            }
        }
    }
}