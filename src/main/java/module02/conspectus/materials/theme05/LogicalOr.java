package module02.conspectus.materials.theme05;

public class LogicalOr {
    public static void main(String[] args) {
        // Записывается символами ||. Результат будет true, если хотя бы один операнд - true
        
        boolean x = true;
        boolean y = false;
        boolean z = false;
        
        boolean xOrY = x || y;
        boolean yOrZ = y || z;
        
        System.out.println(xOrY);
        System.out.println(yOrZ);
    }
}