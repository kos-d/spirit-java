package goit.module03.homework.autocheck;

public class TrurlBank {
    public int sumQuads(int n) {
        int count = 1;
        int result = 0;
        while (count <= n) {
            result = result + count * count;
            count++;
        }
        return result;
    }
    /*
    public int sumQuads(int n) {
        int result = 0;

        while(n > 0) {
            result += n * n;
            n--;
        }

        return result;
    }
     */
    public int countSumOfDigits(int number) {
        int result = 0;
        int count = 0;
        String num = String.valueOf(number);
        while ( count < num.length()) {
            result += Integer.parseInt(String.valueOf(num.charAt(count)));
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));

        System.out.println(bank.countSumOfDigits(547));
    }
}
