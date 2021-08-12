package offtop.luxcity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution02 {
    public static void main(String[] args) {
        
        runCode();
        //int[] food1 = {10, 2, 7, 7, 2};
        
//        Set<Integer> numbers = new HashSet<>();
//        
//        for (int number : food1) {
//            numbers.add(number);
//        }
////        System.out.println(numbers);
//        List<Integer> food = new ArrayList<>();
//        
//        for (int el : numbers) {
//            food.add(el);
//        }
        
//        System.out.println(food);
//        int sum = 0;
//        for (int el : food) {
//            sum += el;
//        }
//        System.out.println(sum);
    }
	
    public static int getResult(List<Integer> food) {
        Set<Integer> numbers = new HashSet<>(food);
        int sum = 0;
        for (int el : numbers) {
            numbers.add(el);
            sum += el;
        }        
        return sum;
    }

    public static void runCode() {
//        int[] number = {10, 2, 7, 7, 2};
        //int[] number = {2, 3, 3, 2, 1};
        List<Integer> food = new ArrayList<>();
        food.add(10);
        food.add(2);
        food.add(7);
        food.add(7);
        food.add(2);
        
        //Set<Integer> numbers = new HashSet<>(food);
        
//        for (int el : number) {
//            numbers.add(el);
//        }
        
        int result = getResult(food);
        System.out.println(result);
    }
}