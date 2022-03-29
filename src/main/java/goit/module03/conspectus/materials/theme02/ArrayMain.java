package goit.module03.conspectus.materials.theme02;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        
        
        int intMax = Integer.MAX_VALUE;
        System.out.println(intMax);
        
                
        // array max length, type int - 2 147 483 647 
        
        int[] month = new int[12];
        
        int[] planets;
        planets = new int[9];
        
        int[] prices = {100, 200, 300};
        
        float[] weights = new float[3];
        weights[0] = 1f;
        weights[1] = 5f;
        weights[2] = 6f;
        
        byte[] kilobyte = new byte[1024];
        byte firstByte = kilobyte[0];
        
        boolean[] lights = {true, false, true};
        int lightsCount = lights.length;
        System.out.println(lightsCount);
        //System.out.println(lights.length);
        
        char[] letters = {'a', 'b', 'c'};
        char lastLetter = letters[letters.length - 1];
        System.out.println(lastLetter);
        
        
        char[][] chessboard = new char[8][8];
        chessboard[0][0] = 'k';
        
        int[] arrSource = {1, 2, 3, 4, 5};
//        int[] arrTarget = arrSource;
//        arrSource[0] = 100;
//        System.out.println(arrTarget[0]);

        int[] arrTarget = Arrays.copyOf(arrSource, arrSource.length);
        arrSource[0] = 100;
        System.out.println(arrTarget[0]);
        
        System.out.println(Arrays.toString(arrSource));
        System.out.println(Arrays.toString(arrTarget));
        
    }
}