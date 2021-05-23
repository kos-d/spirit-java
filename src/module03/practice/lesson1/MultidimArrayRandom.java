package module03.practice.lesson1;

public class MultidimArrayRandom {
    private int[][] a;
    
    public MultidimArrayRandom(int n, int m) {
        a = new int[n][m];
    }
    public int getElement(int i, int j) {
        return a[i][j];
    }
    public void setElement(int i, int j, int value) {
        a[i][j] = value;
    }
    
    public static MultidimArrayRandom createRandom(int n, int m) {
        MultidimArrayRandom array = new MultidimArrayRandom(n, m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array.setElement(i, j, (int) (Math.random() * m * m));
            }
        }
        return array;
    }
    
    public String toString() {
        String s = "\nArray : " + a.length +
                "x" + a[0].length + "\n";
        for (int[] vector : a) {
            for (int value : vector) {
                s += value + " ";
            }
            s += "\n";
        }
        return s;
    }
    
    public static void main(String[] args) {
        
        //int n = 2, m = 3;
        int n = 5, m = 4;
        MultidimArrayRandom array = MultidimArrayRandom.createRandom(n, m);
        System.out.println(array);
    }
}