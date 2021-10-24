package books.promdev.part_02_libraries.chapt08;

public class MultiTryCatch {
    public static void main(String[] args) {
        try {
            int a = (int) (Math.random() * 2) - 1;
            System.out.println("a = " + a);
            try {
                int b = 1 / a;
                StringBuffer sb = new StringBuffer(a);
            } catch (NegativeArraySizeException e) {
                System.err.println("wrong size buffer: " + e);
            }
        } catch (ArithmeticException e) {
            System.err.println("divede on 0 " + e);
        }
    }
}
