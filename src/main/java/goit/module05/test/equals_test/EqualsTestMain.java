package goit.module05.test.equals_test;

public class EqualsTestMain {
    public static void main(String[] args) {
        EqualsTest obj1 = new EqualsTest(11, 12);
        EqualsTest obj2 = new EqualsTest(11, 12);
        
        System.out.println("Objects :\n\tobj1 = " + obj1 +
                                    "\n\tobj2 = " + obj2);
        System.out.println("hashCode objects :" +
                            "\n\tobj1.hashCode = " + obj1.hashCode() +
                            "\n\tobj2.hashCode = " + obj2.hashCode());
        System.out.println("Equals objects :" +
                            "\n\tobj1.equals(obj2) = " + obj1.equals(obj2));
    }
}