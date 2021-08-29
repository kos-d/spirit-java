package module07_collection.test.interface_tutorial;

public interface Series {
    
    int MAX = 10;
    String ERRORMSG = "Cannot go above value: " + MAX;
    
    int getNext();
    
    default void printStuff() {
        System.out.println("Live from New York.");
    }
    
    static void staticPrintStuff() {
        System.out.println("Live from static method from Series interface");
    }
    
//    private void printMoreStuff() {
//        System.out.println("More stuff");
//    }
}
