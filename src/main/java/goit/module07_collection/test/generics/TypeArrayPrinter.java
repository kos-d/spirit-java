package goit.module07_collection.test.generics;

public class TypeArrayPrinter {
    public <E> void printArray(E[] data) {
        for (E item : data) {
            System.out.println("item -> " + item);
        }
    }
}
class TypeArrayPrinterTest {
    public static void main(String[] args) {
        String[] items = {"Hello", "Java"};
        Integer[] years = {2000, 3000};
        
        TypeArrayPrinter print = new TypeArrayPrinter();
        
       print.printArray(items);
       print.printArray(years);
    }
}