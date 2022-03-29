package goit.module03.practice.lesson1;

public class MultidimArray {
    public static void main(String[] args) {
        
        int[][] array = new int[2][3];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("array[" + i + "][" + j + "] -> " + array[i][j]);
            }
        }
        int [][] array1 = {
            {2, 3},
            {4, 5, 6},
        };
        
        x:for (int[] array2 : array1) {
            for (int value : array2) {
                System.out.println("value -> " + value);
                break x;        // x - merker
            }
        }
    }
}