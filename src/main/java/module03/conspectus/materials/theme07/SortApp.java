package module03.conspectus.materials.theme07;

import java.util.Arrays;

public class SortApp {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 7};
        
        Arrays.sort(numbers);
        
        for(int num : numbers) {
            System.out.println(num);
        }
    }
}