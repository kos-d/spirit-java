package module08.conspectus.materials.theme01;

public class TypeArrayPrinter {
    public <E> void printArray(E[] data) {
        for (E item : data) {
            System.out.println(item);
        }
        System.out.println();
    }
}