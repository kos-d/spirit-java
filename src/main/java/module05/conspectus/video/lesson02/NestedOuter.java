package module05.conspectus.video.lesson02;

public class NestedOuter {
    // имеет доступ к статике
    // для не статики создаем экземпляр класса
    // обращение через имя класса 
    
    static int outerVariable = 10;
    
    private static int staticOuterVariable = 20;
    
    private int nonStaticVariable = 10;
    
    static class NestedInnerClass {
        
        public NestedInnerClass() {
            
        }
        
        void display() {
            System.out.println("outer variable " + outerVariable);
            
            System.out.println("static outer variable " + staticOuterVariable);
        }
    }
}