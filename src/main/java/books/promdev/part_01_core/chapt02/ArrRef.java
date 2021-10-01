package books.promdev.part_01_core.chapt02;

public class ArrRef {
    public static void main(String[] args) {
        int[] myRef, my;
        float[] myRefFloat, myFloat;
        int[] myDyn = new int[10];
        int[] myInt = {5, 7, 9, -5, 6, -2};
        byte[] myByte = {1, 3, 5};
        
        for (byte b : myByte) {
            System.out.printf("%d ", b);
        }
        
        System.out.println("");
        
        for (int i : myInt) {
            System.out.printf("%d ", i);
        }
        
        System.out.println("");
        Object myObj = new float[5];
        myRef = myDyn;
        myDyn = myInt;
        myRefFloat = (float[])myObj;
        myObj = myByte;
        //myRefFloat = (float[])myObj;
        
        int[][] arr = { { 1 },
                        { 2, 3 },
                        { 4, 5, 6 },
                        { 7, 8, 9, 0 }
        };
        
        System.out.println(arr[0][0]);  //1
        System.out.println(arr[1][0]);  //2
        System.out.println(arr[1][1]);  //3
        System.out.println(arr[2][0]);  //4
        System.out.println(arr[2][1]);  //5
        System.out.println(arr[2][2]);  //6
        System.out.println(arr[3][0]);  //7
        System.out.println(arr[3][1]);  //8
        System.out.println(arr[3][2]);  //9
        System.out.println(arr[3][3]);  //0
    }
}