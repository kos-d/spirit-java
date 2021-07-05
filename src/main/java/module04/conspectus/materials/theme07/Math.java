package module04.conspectus.materials.theme07;

public class Math {
    public int sum(int a, int b) {
        return a + b;
    }
    
    public int sum(int a, int b, int c) {
        return sum(sum(a, b), c);
    }
    
    public long sum(long a, long b) {
        return a + b;
    }
}