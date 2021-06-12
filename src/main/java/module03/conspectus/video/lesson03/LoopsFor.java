package module03.conspectus.video.lesson03;

public class LoopsFor {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        System.out.println("_____________________");
        
        for (int element : array) {
            System.out.println(element);
        }
    }
}