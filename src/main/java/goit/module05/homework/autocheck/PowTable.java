package goit.module05.homework.autocheck;
import java.util.Arrays;
public class PowTable {
    //public static final int[] POWERS_2;
    public static int[] POWERS_2;
    public static int[] POWERS_2_copy;
    static {
        POWERS_2 = new int[10];
        POWERS_2_copy = new int[10];
        POWERS_2[9] = 100;
        for (int i = 0; i < POWERS_2_copy.length; i++) {
            POWERS_2_copy[i] = i * i;
        }
        POWERS_2[0] = POWERS_2_copy[1];
        POWERS_2[1] = POWERS_2_copy[2];
        POWERS_2[2] = POWERS_2_copy[3];
        POWERS_2[3] = POWERS_2_copy[4];
        POWERS_2[4] = POWERS_2_copy[5];
        POWERS_2[5] = POWERS_2_copy[6];
        POWERS_2[6] = POWERS_2_copy[7];
        POWERS_2[7] = POWERS_2_copy[8];
        POWERS_2[8] = POWERS_2_copy[9];

    }
}


class PowTableTest {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(PowTable.POWERS_2));
       // System.out.println(Arrays.toString(PowTable.POWERS_2_copy));
    }
}
