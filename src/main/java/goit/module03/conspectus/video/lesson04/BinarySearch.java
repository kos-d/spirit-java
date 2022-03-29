package goit.module03.conspectus.video.lesson04;

public class BinarySearch {
    private static int counter = 0;
    public static void main(String[] args) {
        int[] array = new int[] {-10, -9, -8, -5, -4, 0, 1, 2, 10, 11, 12, 15};
        int resultBinarySearch = binarySearch(array, -5);
        
        System.out.println("Array length:  " + array.length);
        System.out.println(resultBinarySearch);
        System.out.println(counter);
    }
     private static int binarySearch(int[] array, int elementToSearch) {
        int lowIndex = 0;        
        int highIndex = array.length - 1;
        
        while (lowIndex <= highIndex) {
            counter++;
            int midIndex = (lowIndex + highIndex) / 2;
            
            int midElement = array[midIndex];
            if (midElement < elementToSearch) {
                lowIndex = midIndex + 1;
            } else if (midElement > elementToSearch) {
                highIndex = midIndex - 1;
            } else {
                return midElement;
            }
        }
        return -1;
    }
}