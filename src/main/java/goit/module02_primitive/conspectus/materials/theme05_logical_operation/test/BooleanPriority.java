package goit.module02_primitive.conspectus.materials.theme05_logical_operation.test;

public class BooleanPriority {
/*
    1. !
    2. &    *
    3. ^
    4. |    +
    5. &&
    6. ||
*/
    public static void main(String[] args) {
        boolean a = true, b = true, c = false;
        
        System.out.println(a | b & c);      // true
        System.out.println((a | b) & c);    // false
    }
}