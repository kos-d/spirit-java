package books.promdev.chapt04;

public class BaseRunner {
    public static void main(String[] args) {
        Base ob1 = new Base();
        Base ob2 = new Sub();
        
        Sub ob3 = new Sub();
        
        Base.assign();
        Sub.assign();
        
//        Base.assign();
//        Base.assign();
    }
}