package goit.module07_collection.practice.lesson1.iterator_example;

public class Main {
    
    public static void main(String[] args) {
        
        String[] arr = { "a", "b", "c" };
        
        ArrayWrapper<String> arrayWrapper = new ArrayWrapper<>(arr);
        
        String e0 = arrayWrapper.get(0);
        
        System.out.println("e0 " + e0);
        
        arrayWrapper.set(0, "x");
       
        System.out.println("" + arrayWrapper);
    }
}
