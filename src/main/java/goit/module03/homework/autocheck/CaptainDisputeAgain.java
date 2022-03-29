package goit.module03.homework.autocheck;

public class CaptainDisputeAgain {
    public int findMin(int[] triple) {
        int value1 = triple[0];
        int value2 = triple[1];
        int value3 = triple[2];

        return value1 < value2 & value1 < value3 ? value1 : value2 < value1 & value2 < value1 ? value2 : value3;

        /*public class CaptainDisputeAgain{
            public int findMin(int[] triple){
                int a = triple[0];
                int b = triple[1];
                int c = triple[2];
                //return a > b & a > c ? a : b > a & b > c ? b : c;     // max value
                  return a < b & a < c ? a : b < a & b < c ? b : c;     // min value
            }
        }*/

    }

    public static void main(String[] args) {
        CaptainDisputeAgain dispute = new CaptainDisputeAgain();

        System.out.println(dispute.findMin(new int[] {1, 10, 3}));

        System.out.println(dispute.findMin(new int[] {50, 4, 100}));
        System.out.println(dispute.findMin(new int[] {677, 278, 46}));
        System.out.println(dispute.findMin(new int[] {829, 556, 149}));

    }
}
