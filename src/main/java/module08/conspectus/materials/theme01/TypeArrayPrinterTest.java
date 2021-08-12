package module08.conspectus.materials.theme01;

public class TypeArrayPrinterTest {
    public static void main(String[] args) {
        String[] items = {"Hello", "Java"};
        Integer[] years = {2000, 3000};
        
        TypeArrayPrinter typeArrayPrinter = new TypeArrayPrinter();
        typeArrayPrinter.printArray(items);
        typeArrayPrinter.printArray(years);
    }
}