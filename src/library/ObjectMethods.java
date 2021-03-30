package library;

public class ObjectMethods {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        
        System.out.println(obj1.equals(obj2));
        Object objA = new Object();
        Object objB = new Object();
    
        System.out.println(objA.equals(objB));
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    

}