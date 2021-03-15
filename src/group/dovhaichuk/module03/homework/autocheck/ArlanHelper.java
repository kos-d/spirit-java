package module03.homework.autocheck;

public class ArlanHelper {
    public String drawQuad(int n) {

        String result = "";


        int i = 0;
        while (i<n) {

            i++;



            System.out.println(result);
        }

        int j = 0;
        while (j<i) {
            System.out.println(j);
            j++;
            result = result = "*" + "\n";

            System.out.println(result);
        }
        return  result;

    }

    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();

        //helper.drawQuad(4);
        System.out.println(helper.drawQuad(4));
    }
}
