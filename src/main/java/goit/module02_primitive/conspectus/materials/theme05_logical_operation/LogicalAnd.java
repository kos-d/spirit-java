package goit.module02_primitive.conspectus.materials.theme05_logical_operation;

public class LogicalAnd {
    public static void main(String[] args) {
        // Записывается символами &&. Результат будет true, если ОБА операнда - true
        
        boolean x = true;
        boolean y = false;
        
        boolean result = x && y;
        
        System.out.println(result); // false
    }
}