package goit.module02_primitive.conspectus.video.lesson02;

public class BiteBooleanOperationApp {
    public static void main(String[] args) {
  
        System.out.println("");

        // Побитовый | (ИЛИ)
        boolean result0 = getTrue() | getFalse();
        System.out.println("");

        // логический || (ИЛИ)
        boolean result1 = getTrue() || getFalse();
        System.out.println("");

        // Побитовый & (И)
        boolean result2 = getFalse() & getTrue();
        System.out.println("");

        // Логический && (И)
        boolean result3 = getFalse() && getTrue();

    }

    public static boolean getTrue() {
        System.out.println("Enter getTrue method");
        return true; 
    }
    public static boolean getFalse() {
        System.out.println("Enter getFalse method");
        return false;
    }
}
