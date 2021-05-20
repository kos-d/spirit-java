package module07.test.interface_tutorial;

public class Main {
    
    public static void main(String[] args) {
        
        ByTwos byTwos = new ByTwos();
    
        for (int i = 0; i < 5; i++) {
            System.out.println("byTwos: " + byTwos.getNext());
        }
        
        System.out.println("--------------------------");
        
        ByThrees byThrees = new ByThrees();
        for (int i = 0; i < 5; i++) {
            System.out.println("byThrees: " + byThrees.getNext());
        }

        System.out.println("--------------------------");
        
        Series ob;
        
        for (int i = 0; i < 5; i++) {
            ob = byTwos;            
            System.out.println("byTwos: " + ob.getNext());
        }
        System.out.println("--------------------------");
        for (int i = 0; i < 5; i++) {
            ob = byThrees;
            System.out.println("byThrees: " + ob.getNext());
        }
        System.out.println("--------------------------");
        for (int i = 0; i < 5; i++) {
            ob = byTwos;            
            System.out.println("byTwos: " + ob.getNext());
            
            ob = byThrees;
            System.out.println("byThrees: " + ob.getNext());
        }
        System.out.println("--------------------------");
        
        ByTwos ob1;
        for (int i = 0; i < 5; i++) {
            ob1 = byTwos;            
            System.out.println("byTwos: " + ob1.getPrev());
            
//            ob = byThrees;
//            System.out.println("byThrees: " + ob.getNext());
        }
        
        for (int i = 0; i < 6; i++) {
            ob = byTwos;            
            System.out.println("byTwos: " + ob.getNext());

        }
        
        // default method from interface
        
        byTwos.printStuff();
        
        Series.staticPrintStuff();
    }
}