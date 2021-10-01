package books.promdev.part_01_core.chapt02;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int mas1[] = { 1, 2, 3 }, mas2[] = { 4, 5, 6, 7, 8, 9 };
        show("mas1[]: ", mas1);
        show("mas2[]: ", mas2);
        
        // copy array mas1[] in mas2[]
        System.arraycopy(mas1, 0, mas2, 2, 3);
        /*
        0 - mas1[] копируется начиная с первого элемента,
        2 - элемент, с которого начинается амена,
        3 - количество копируемых элементов
        */
        System.out.printf("%n after arraycopy(): ");
        show("mas1[]: ", mas1);
        show("mas2[]: ", mas2);
    } 
    
    private static void show(String s, int[] mas) {
        System.out.printf("%n%s", s);
        for (int i : mas) {
            System.out.printf("%d ", i);
        }
    }
}