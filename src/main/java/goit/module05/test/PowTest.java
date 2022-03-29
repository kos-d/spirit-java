package goit.module05.test;

public class PowTest{

    public static void main(String args[]){
        int a = 1; // Начальное число
        int b = 10; // Конечное число

        // Возведение каждого числа в квадрат и вывод на экран
        for (int i = a; i <= b; i++){
            System.out.printf("Значение " + i + " в квадрате равно %.0f \n", Math.pow(i, 2));
        }
    }
}
