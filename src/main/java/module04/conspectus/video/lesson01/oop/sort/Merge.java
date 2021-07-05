package module04.conspectus.video.lesson01.oop.sort;

public class Merge {
    public int[] merge(int[] arr_1, int[] arr_2) {
        int len_1 = arr_1.length, len_2 = arr_2.length;
        int a = 0, b = 0, len = len_1 + len_2; 
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
                if (b < len_2 && a < len_1) {
                        if (arr_1[a] > arr_2[b]) result[i] = arr_2[b++];
                        else result[i] = arr_1[a++];
                } else if (b < len_2) {
                        result[i] = arr_2[b++];
                } else {
                        result[i] = arr_1[a++];
                }
        }
        return result;
    }
}