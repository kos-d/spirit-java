package offtop.nix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalcSum {
    public static void main(String[] args) {
        BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));
        String[] sArr = new String[2];
        double[] dArr = new double[2];
        try {
            System.out.println("Enter two number,");
            System.out.println("after number press <Enter> ->");
            for (int i = 0; i < 2; i++) {
                sArr[i] = br.readLine();
                dArr[i] = Double.valueOf(sArr[i]).doubleValue();
            }
            for (int i = 0; i < 2; i++) {
                double result = sum(dArr[i], dArr[i]);
            }

        } catch (IOException e) {
            System.out.println("error input " + e);
        }
        
    }
    private static double sum(double a, double b) {
        return a + b;
    }
}