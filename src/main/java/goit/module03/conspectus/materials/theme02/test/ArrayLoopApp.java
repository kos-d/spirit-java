package goit.module03.conspectus.materials.theme02.test;

public class ArrayLoopApp {
    public static void main(String[] args) {
        
        int[] array = new int[] {10, 20, 30, 40, 50};
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("array " + "[" + i + "] - " + array[i]);
        }
        
        System.out.println("-------------- while");
        
        int counter = 0;
        while (counter < 10) {
            System.out.println(" "+counter);
            counter++;
            
        }
        
        System.out.println("--------------do while");
        
        int number = 1;        
        do {
            System.out.println(number);
            number++;
        } while (number < 5);
    }
}