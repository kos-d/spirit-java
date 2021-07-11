package module02.conspectus.materials.theme05;

public class ExclusiveOr {
    public static void main(String[] args) {
        // Записывается символом ^. Возвращает true, если оба операнды - РАЗНЫЕ
        
        boolean x = true;
        boolean y = false;
        
        boolean result = x ^ y;
        
        System.out.println(result);
    }
}