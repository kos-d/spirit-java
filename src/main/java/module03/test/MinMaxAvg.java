package module03.test;

import java.util.Arrays;
import java.util.Random;

public class MinMaxAvg {
    public static void main(String[] args) {
        int n = 10;
        int min = 1;
        int max = 2;        
        
        int[] array = new int[n];
        
//        Random rnd = new Random();
//        rnd.setSeed(max);
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 5);
        }
    
        MinMaxAvg app = new MinMaxAvg();
        String minMaxAvg = app.minMaxAvg(array);
        
        
        System.out.println(minMaxAvg);
        
    }
    
    public String minMaxAvg(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        int avg = 0;
        int[] result = new int[3];
        
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i])
                max = numbers[i];
            if (min < numbers[i])
                min = numbers[i];
            avg += numbers[i]/numbers.length;
            result[0] = min;
            result[1] = max;
            result[2] = avg;
        }
        return Arrays.toString(result);
    }
    
}