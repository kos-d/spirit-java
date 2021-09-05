package module02_primitive.conspectus.materials.theme05_logical_operation;

public class LazyOperators {
    public static void main(String[] args) {
        // Операторы && и || - ленивые. 
        // Это значит, что если в процессе вычисления результат выражения становится известный,
        // то дальше выражение не считается
        
        // Есть также операторы & и |. 
        // Они работают аналогично операторам && и ||, 
        // но всегда вычисляется все выражение - без ленивости.
        
        boolean a = false;
        boolean b = true;
        boolean c = false;
        
        boolean result = a && b && c;
        
        System.out.println(result);
    }
}