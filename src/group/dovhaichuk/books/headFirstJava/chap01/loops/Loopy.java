package books.headFirstJava.chap01.loops;

public class Loopy {

    public static void main(String[] args) {

        int x = 1;
        System.out.println("Перед началом цикла");
        
        while(x < 4) {

            System.out.println("Внутри цикла");
            System.out.println("Значение х равно " + x);
            x = x + 1;
        }
        System.out.println("После окончания цикла");
    }
}
