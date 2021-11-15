package books.practic.chapt01;

public class FindReplace {
    public static void main(String[] args) {
        int[] myArray;
        int[] mySecond = new int[10];
        int[] a = {5, 10, 0, -5, 16, -2};
        int max = a[0];
        for (int i = 0; i < a.length; i++)
            if (max < a[i])
                max = a[i];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) 
                a[i] = max;
            mySecond[i] = a[i];
            System.out.println("a[" + i + "]= " + a[i]);
        }
        myArray = a;
    }
}