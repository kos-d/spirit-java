package module02_primitive.conspectus.materials.theme05_logical_operation.test;

public class LogicalOR {
/*  дизъюнкция
    a       b       a | b
    true    true    true
    true    false   true
    false   true    true
    false   false   false
*/
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        System.out.println(!a | b);             // false
        System.out.println(a | c);              // true
        System.out.println((2 < 5) | false);    // true
        System.out.println((2 > 5) | true);     // true
    }
}