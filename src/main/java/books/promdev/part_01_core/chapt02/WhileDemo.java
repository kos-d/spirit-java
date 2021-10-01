package books.promdev.part_01_core.chapt02;

public class WhileDemo {
    public static void main(String[] args) {
        int j = -3;
        OUT: while(true) {
            for (;;) 
                while (j < 10) {
                    if (j == 0) 
                        break OUT;
                    else {
                        j++;
                        System.out.printf("%d ", j);
                    }
                }
        }
        System.out.print("end");
    }
}