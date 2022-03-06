package cr.test;

public class AppTest {
    public static void main(String[] args) {
        
//        char tableNumber = (char) 96;
        char tableNumber = (char) 32;
//        System.out.print(tableNumber + " ");
        
        
        
            for (int k = 0; k < 4; k++) {
                for (int i = 0; i < 25; i++) {
                    tableNumber++;
                            System.out.print(tableNumber + " ");

                }
                System.out.println("");
            }
    }
}