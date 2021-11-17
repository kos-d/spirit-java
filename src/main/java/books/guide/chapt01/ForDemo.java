package books.guide.chapt01;

public class ForDemo {

    public static void main(String[] args) {
        int count, x;

        for (count = 0; count < 5; count = count + 1) { // count++
            System.out.println("Value count: " + count);
        }
        System.out.println("Count Ready!");
        
        for (x = 10; x >= -10; x--) {
            System.out.println("Value x: " + x);
        }
        System.out.println("X Ready!");
    }
}
