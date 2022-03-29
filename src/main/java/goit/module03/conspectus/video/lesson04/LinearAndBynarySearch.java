package goit.module03.conspectus.video.lesson04;

public class LinearAndBynarySearch {
    
    
    public static void main(String[] args) {
        
        int[] array = new int[] {-10, -9, -8, -5, -4, 0, 1, 2, 10, 11, 12, 15};
        int counter = 0;
        int elementToSearch = 10;
        int resultElement = -1;
        
        for (int i = 0; i < array.length; i++) {
            counter++;
            if (array[i] == elementToSearch) {
                resultElement = array[i];
                break;
            }
        }
        System.out.println("Counter: " + counter);
        System.out.println("Array length:  " + array.length);
        System.out.println(resultElement);
    }
    
}