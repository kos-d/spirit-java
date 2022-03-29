package goit.module04.conspectus.materials.theme04;

public class QuadSummator {
    public int sumQuads(int n) {
        int result = 0;
        
        for (int i = 1; i <= n; i++) {
            result += pow2(i); 
        }
        return result;
    }
    
    private int pow2(int number) {
        return number * number;
    }
}