package goit.module03.conspectus.video.lesson03;

public class LoopsWhile {
    public static void main(String[] args) {
        int counter = 0;
        while(counter < 4) {
            counter++;
            System.out.println(counter);
        }
        System.out.println("_________________________");
        int counter1 = 0;
        
        do {
            counter1++;
            System.out.println(counter1);
        } while (false);
        
        System.out.println("_________________________");
        
        int counter2 = 1;
        
        while (counter2 != 5) {
            counter2++;
            System.out.println(counter2);
            if (counter2 == 3) {
                break;
            }
        }
    }
}