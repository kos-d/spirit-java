package module05.conspectus.materials.theme05;

public class MathTest {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException ex) {
            System.out.println("Block catch");
        } 
    }
}