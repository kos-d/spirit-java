package goit.module05.homework.autocheck;

class ArrayWorker {
    public void printElement(int[] array, int index) {
        try {
            System.out.println("value is " + array[index]);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("wrong index");
        } finally {
            System.out.println("index is " + index);
        }
    }
}
class ArrayWorkerTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        
        new ArrayWorker().printElement(array, 0);
        
        new ArrayWorker().printElement(array, 10);
    }
}