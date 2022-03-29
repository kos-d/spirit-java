package goit.module05.conspectus.video.lesson02;

public class LocalInnerExample {
    private int data = 10;
    
    void display() {
        final int methodVariable = 20;
        class LocalInner {
            void msg() {
                System.out.println(methodVariable);
                System.out.println("msg");
                System.out.println(data);
            }
        }
        LocalInner local = new LocalInner();
        local.msg();
    }
    
    public static void main(String[] args) {
        LocalInnerExample outerClass = new LocalInnerExample();
        outerClass.display();
    }
}