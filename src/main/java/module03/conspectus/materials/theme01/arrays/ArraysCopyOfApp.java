package module03.conspectus.materials.theme01.arrays;

import java.util.Arrays;

public class ArraysCopyOfApp {
    public static void main(String[] args) {
        int[] arrSource = {1, 2, 3, 4, 5};
        int[] arrTarget = Arrays.copyOf(arrSource, arrSource.length);
        
        arrSource[0] = 100;
        System.out.println(arrTarget[0]);
        
        
        System.arraycopy(arrSource, 0, arrTarget, 0, 0);
        
        
        // wrong copy
        int[] arrTarget1 = arrSource;
        arrSource[0] = 100;
        System.out.println(arrTarget1[0]);
    }
    
    
}