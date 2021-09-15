package books.promdev.chapt02.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomArrayApp {
    private static Random rand = new Random();
    public static void main(String[] args) {
        
        int[] array = new int[15];
        
        for (int i = 0; i < array.length; i++) {
            array[i] = randomValue();
        }
        System.out.println(Arrays.toString(array));
    }
    
    private static int randomValue() {
        final int MAX_VALUE = 31;
        final int RANGE = 15;
        int result;        
        result = (int) Math.round((Math.random() * MAX_VALUE) - RANGE);
//        array[i] = ((int)(Math.random()*16) - (int)(Math.random()*16));
        return result;
    }
    
    public static int getRandom(int lo, int hi) {
        return lo + rand.nextInt(hi - lo + 1);
    } // getRandom
    
    private List getRandomNumberList(){
        List<Integer> alist = new ArrayList<>();
        while (alist.size() < 5){
            // for numbers from 0 to 100 use factor 101
            int number = (int) (Math.random() * 101);
            if (!alist.contains(number)){
                alist.add(number);
            }
        }
        return alist;
    }
}