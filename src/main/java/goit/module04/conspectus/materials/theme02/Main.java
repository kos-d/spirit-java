package goit.module04.conspectus.materials.theme02;

public class Main {
    
    public static void main(String[] args) {
        
        Main app = new Main();
        app.sayHello("Test", 5);
        
        Math math = new Math();
        math.printNumbers(2, 5);
    }
    
    public String sayHello(String name, int count) {
            for (int i = 0; i < count; i++) {
                System.out.println(name);
            }
            return "name";
        }
    
    
    
}