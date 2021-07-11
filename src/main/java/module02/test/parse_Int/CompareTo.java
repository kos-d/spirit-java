package module02.test.parse_Int;

public class CompareTo<T>{

    public static int compareTo(Integer a, Integer b) {
        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }
    
        T a_generic;
        T b_generic;
    
        private Integer a = 2;
        private Integer b = 3; 

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }
    
    public static void main(String[] args) {
        
        //CompareTo app = new CompareTo();
        
        int compareTo = CompareTo.compareTo(5, 5);
        System.out.println(compareTo);
        
    }
//    public int compareTo(Integer value) {
//        if (a > b) {
//            return 1;
//        } else if (a < b) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
}