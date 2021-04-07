package module07.conspectus;

public class ExtendsNumberApp {
    public <E extends Number & Comparable> void printNumber(E[] array) {
        for (E item : array) {
            System.out.println("item -> " + item);
        }
    }
    public static void main(String[] args) {
        Integer[] years = {2003, 2001, 2002};
        Double[] myDouble = {2.1, 2.2, 2.3};
        
        ExtendsNumberApp extendsNumber = new ExtendsNumberApp();
        extendsNumber.printNumber(years);
        extendsNumber.printNumber(myDouble);
        
        extendsNumber.printNumber(years);
    }
}