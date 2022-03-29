package goit.module02_primitive.conspectus.materials.theme05_logical_operation.test;

public class LogicalNOT {
/*
    Значение a |    !a
    false      |    true
    true       |    false
*/
    public static void main(String[] args) {
        
        boolean a = true;
        System.out.println(!a);         // false
        System.out.println(!false);     // true
        System.out.println(!(2 < 5));   // false
    }
}