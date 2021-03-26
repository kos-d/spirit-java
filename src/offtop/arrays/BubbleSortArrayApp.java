package arrays;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

class MethodsArraysApp {
    public static void main(String[] args) {

//        int[] myArray;              // объявление массива 
//        myArray = new int[5];       // создание, выделение памяти для 10 элементов типа int

//        String[] seasons = new String[] {"Winter", "Spring", "Summer", "Autumn"};
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        boolean needIteration = true;

        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}





/*
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);        
        }
    }
}

        int [][] myArray = {{18,28,18,12}, {28,45,90,20}, {45,3,14,5}};

        System.out.println(Arrays.deepToString(myArray));
        System.out.println(myArray.length);
        
        System.out.println(myArray[0].length);
        System.out.println();

        String[][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessBoard[i][j] = "W";    
                } else chessBoard[i][j] = "B";
            System.out.println();
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(chessBoard));
    }
        //System.out.println(chessBoard[0].length);
}

*/

/*        
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};

        for (int i = 0; i < seasons.length; i++) {
            System.out.println(seasons[i]);
        }
        System.out.println();
        
        for (int i = seasons.length-1; i >= 0; i--) {
            System.out.println(seasons[i]);
        }
        System.out.println();
        
        for (int i = 0; i < 4; i++) {
            System.out.println(seasons[i]);
        }
        System.out.println();

        int[] myArray = new int[8];
        
        int[][] myTwoDimentionalArray = new int[8][8];

        int[][] twoDimArray = new int[3][4];

        twoDimArray[0][0] = 5;
        twoDimArray[0][1] = 7;
        twoDimArray[0][2] = 3;
        twoDimArray[0][3] = 17;
        twoDimArray[1][0] = 7;
        twoDimArray[1][1] = 0;
        twoDimArray[1][2] = 1;
        twoDimArray[1][3] = 12;
        twoDimArray[2][0] = 8;
        twoDimArray[2][1] = 1;
        twoDimArray[2][2] = 2;
        twoDimArray[2][3] = 3;

        int[][] myTwoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};

        for (int i = 0; i < 3; i++) {       // идем по строкам
            for (int j = 0; j < 4; j++) {     // идем по столбцам
                System.out.print(" " + myTwoDimArray[i][j] + " "); // вывод элемента
            }
        System.out.println();               // перенос строки для табл формы
        }
    }      

}

*/
/*
        int[] myArray = new int[5];
        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = 5;
        }
        System.out.println(Arrays.toString(myArray));
        
        myArray[0] = 4;
        myArray[1] = 3;
        
        int[] myArrayCopy = new int[5];
        
        for (int i = 0; i < myArray.length; i++) {
            myArrayCopy[i] = myArray[i];
        }
        System.out.println("copy = " + Arrays.toString(myArrayCopy));
        
        int[] myArrayCopySort = new int[5];
        for (int i = 0; i < myArrayCopySort.length; i ++) {
            myArrayCopySort[i] = myArrayCopy[i];
            
            
        }
            System.out.println("myArrayCopySort befor = " + Arrays.toString(myArrayCopySort) );
            Arrays.sort(myArrayCopySort);
        
        System.out.println("myArrayCopySort after = " + Arrays.toString(myArrayCopySort));
        
        System.out.println(Arrays.toString(myArray));



       
        public static int getRandomInt() {
            Random random = new Random();
            int randomInt = random.nextInt();
            return randomInt();
       
    }    
}

*/


/*
        int[] numbers = {3, 2, 4, 1, 5};
        
        int[] numbersCopy = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbersCopy[i] = numbers[i];        
            System.out.println("numbersCopy[i] = " + numbersCopy[i]); 
        }
        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbersCopy));
        Arrays.sort(numbersCopy);
        System.out.println("Arrays.toString(numbersCopy) = " + Arrays.toString(numbersCopy));
    }
}
*/

/*
        int[] nums = {3, 2, 4, 5, 1 };

        System.out.println("nums.length = " + nums.length);
        System.out.println("nams[0] = " + nums[0]);
        
        for (int i = 0; i < nums.length; i++) {
            
        System.out.println("nums[i] = " + nums[i]);
        }

        for (int i = nums.length -1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]){
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }        
        System.out.println(nums[i]);
        }


        i

    }
}

*/

/*        
        int n, arr[];
        Scanner in = new Scanner(System.in);
        System.out.print("Input value array: ");
        n = in.nextInt();
        arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
        
        }
        for (int i : arr) {
            System.out.println(i + " " );
        }
        in.close();
/*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " );
        }

    }
}
       /* 
        int[] arr = new int[3];
        arr.

        public static int getRandomInt() {
            Random random = new Random();
            int randomInt = random.nextInt();
            return randomInt();
        }
        
    }
}
*/



        /*
        int[] arr = new int[3];
        System.out.println("arr.length = " + arr.length);
        int [] arrNova = new int[5];
        System.out.println("arrNova.length = " + arrNova.length);
        String[] arrString = {"one", "two", "tree"};
        System.out.println("arrString = " + arrString.length);
        System.out.println("" + arrString.toString());
        */

        /*
        int[] arr = new int[3];
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
        System.out.println("arr[2] = " + arr[2]);
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 5;
        }
        
        System.out.println("arr[0] = " + arr[0]);
        System.out.println("arr[1] = " + arr[1]);
        System.out.println("arr[2] = " + arr[2]);
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 4;
        }

        System.out.println("arr[0] = " + arr[0]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 3;
        }
    
        System.out.println("arr[0] = " + arr[0]);
        */

/*
public class ArraysApp {
    public static void main(String[] args) {
    
        byte[] byteArray = new byte[4];
        System.out.println("byteArray.length = " + byteArray.length);

        short[] shortArray = new short[7];
        System.out.println("shortArray.length = " + shortArray.length);

        int[] intArray = new int[3];
        System.out.println("intArray.length = " + intArray.length);

        long[] longArray = new long[8];
        System.out.println("longArray.length = " + longArray.length);

        float[] floatArray = new float[2];
        System.out.println("floatArray.length = " + floatArray.length);

        double[] doubleArray = new double[9];
        System.out.println("doubleArray.length = " + doubleArray.length);

        char[] charArray = new char[6];
        System.out.println("charArray.length = " + charArray.length);

        String[] stringArray = new String[5];
        System.out.println("stringArray.length = " + stringArray.length);

        boolean[] booleanArray = new boolean[11];
        System.out.println("booleanArray.length = " + booleanArray.length);
        
        Person bob = new Person();
        System.out.println(bob.toString());

        Person[] personArray = new Person[2];
        System.out.println("personArray.length  = " + personArray.length);
        personArray[0] = bob;
        System.out.println("personArray[0] = " + personArray[0]);
    }
}

class Person {
    String name = "Bob";
    int age = 20;

    public String toString() {
        return "Person { name " + name + " age " + age + " }";
    }
}

*/
