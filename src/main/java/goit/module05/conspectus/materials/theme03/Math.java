package goit.module05.conspectus.materials.theme03;

public class Math {
    public int sum1toN(int n) {
        
        class Sum {
            public int calculateSum() {
                int result = 0;
                for (int i = 1; i <= n; i++) {
                    result += i;
                }
                return result;
            }
        }
        return new Sum().calculateSum();
    }
}