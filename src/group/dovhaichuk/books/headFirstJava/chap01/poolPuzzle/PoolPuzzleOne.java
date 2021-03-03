package books.headFirstJava.chap01.poolPuzzle;

public class PoolPuzzleOne {

    public static void main(String[] args) {
    
    int x = 0;

        while (x < 4) {
            System.out.print(" ");
            if (x < 1) {
                System.out.print("a ");
            }
            System.out.print("noise");
            if (x > 0) {
                System.out.print("annoys");
                x = x + 1;
            }
            if (x == 1) {
                System.out.print("an");
            }
            if (x > 3) {
                System.out.print(" oyster");
            }
            System.out.println("");
            x = x + 1;
        }        
    }
}
