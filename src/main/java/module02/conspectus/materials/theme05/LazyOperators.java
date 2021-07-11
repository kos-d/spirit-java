package module02.conspectus.materials.theme05;

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