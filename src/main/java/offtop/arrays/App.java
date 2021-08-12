package offtop.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int array[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();
        
    }
}
        
        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input array length");
//        int arrLength = sc.nextInt();        
//        int[] arr = new int[arrLength];
//        
//        System.out.println("Input Number");
//        int nextInt = sc.nextInt();
//        
//        for (int i = 0; i < arr.length; i++) {
//            
//            System.out.println("Enter element " + (i + 1) + ": ");
//            arr[i] = nextInt;
//            // изменить на array[i-1] = input.next();
//            System.out.println(arr[i]);
//            
//        }
