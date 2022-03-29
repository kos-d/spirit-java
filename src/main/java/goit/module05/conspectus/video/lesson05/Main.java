package goit.module05.conspectus.video.lesson05;

public class Main {
    
    private static int c = 10;
    
    public static void main(String[] args) {
        int b = 10;
        method1(b);
        System.out.println(b);
        
        TestObject object = new TestObject();
        object.setB(10);
        method2(object);
        System.out.println(object.getB());
        
        System.out.println(c);
        
    }
    
    private static int method1(int b) {
        return b = 30;
    }
    
    private static void method2(TestObject b) {
        b.setB(20);
        c = 30;
    }
}