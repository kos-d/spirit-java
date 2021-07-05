package module04.conspectus.materials.theme02;

public class Math {
    public void printNumbers(int start, int end) {
        int current = start;
        
        while(true) {
            System.out.println(current);
            current++;
            if (current > end) {
                return;
            }
        }
    }
}