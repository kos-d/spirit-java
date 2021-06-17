package module03.conspectus.materials.theme03.test;
import java.util.Scanner;
import java.util.Arrays;

public class ForLoopApp {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5}; 
        
        for (int i = 0; i < arr.length; i++){
            System.out.println("arr[i] " + arr[i]);
        }
        for(int i = arr.length-1; i >= 0; i--) {
            System.out.println("arr revers " + arr[i]);
        }
        
        int i = arr.length - 1;
        for ( ; i >= 0; ) {
            System.out.println("arr revers " + arr[i]);
            i--;    
        }

        System.out.println("Input number");
        System.out.println("sum press any button and press Enter");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }
        scanner.close();
        System.out.println("sum = " + sum);
        

    }
}













/*

    int[] arr = {1, 2, 3, 4, 5};

    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
        System.out.print("\n");

    for (int i = arr.length-1; i >=0; i--) {
        System.out.println(arr[i]);
    }
        System.out.print("\n");

    for (int i = arr.length-1; i >= 0; i--) {
        System.out.println("array revers " + arr[i]);
    }
    
    String[] seasons = new String[4];
    seasons[0] = "winter";
    seasons[1] = "Spring";
    seasons[2] = "Summer";
    seasons[3] = "Autumn";

    System.out.println(Arrays.toString(seasons));
    
    for (int i = seasons.length-1; i >= 0; i--) {
        System.out.println("seasons revers " + seasons[i]);
    }



   
        int[][] array = new int[4][2]; 
        
        array[0][0] = 0;   
        array[0][1] = 1;   
        array[1][0] = 2;   
        array[1][1] = 3;   
        array[2][0] = 4;   
        array[2][1] = 5;   
        array[3][1] = 6;   
        array[3][1] = 7;   

        
    }
}

*/
/*
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
            System.out.print("\n");

        for (int i = args.length-1; i >= 0; i--) {
            System.out.println(args[i]);
        }
        System.out.println(Arrays.toString(args));

        System.out.print("\n");
    
        int[] array = new int[3];
        
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        int[] myArray = Arrays.copyOf(array, 5);
        myArray[3] = 4;

        
        System.out.println("Arrays.compare() " + Arrays.compare(array, myArray));

                
//        Arrays.copyOf();
//        Arrays.compare(array, myArray)    
        System.out.println(array.toString());
        System.out.println("array " + Arrays.toString(array));
        System.out.println("myArray " + Arrays.toString(myArray));
    }
}

*/

/*

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.print("\n");

        for (int i = args.length-1; i >= 0; i--) {
            System.out.println(args[i]);
        }

    }
} 
*/
