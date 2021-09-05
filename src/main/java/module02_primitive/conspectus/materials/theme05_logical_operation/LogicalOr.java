package module02_primitive.conspectus.materials.theme05_logical_operation;

public class LogicalOr {
    public static void main(String[] args) {
        // Записывается символами ||. Результат будет true, если хотя бы один операнд - true
        
        boolean x = true;
        boolean y = false;
        boolean z = false;
        
        boolean xOrY = x || y;
        boolean yOrZ = y || z;
        
        System.out.println(xOrY);   // true
        System.out.println(yOrZ);   // false
    }
}