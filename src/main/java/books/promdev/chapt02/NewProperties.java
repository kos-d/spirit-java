package books.promdev.chapt02;

public class NewProperties {
    public static void main(String[] args) {
        Integer j = 71;     // create new object + autoboxing
        
        System.out.println(j);
        Integer k = ++j;    // unboxing + operation + autoboxing
        
        System.out.println(j + " " + k);
        
        int i = 2;
        
        k = i + j + k;
        
        System.out.println(i + " " + j + " " + k);
        System.out.println(k);
        
        int a = 1;
        int b = 2;        
        int c = 3;
        
        c = a + b + c;
        
        System.out.println(c);  // 6
        
        int i1 = 127;
        Integer oa = i1;
        Integer ob = i1;
        
        System.out.println("oa == i " + (oa == i));
        System.out.println("ob == i " + (ob == i));
        System.out.println("oa == ob " + (oa == ob));
        System.out.println("equals -> " + oa.equals(i) + " " + ob.equals(i) + " " + oa.equals(ob));
        
        Float f = (float) 7;
        Float f1 = 7F;
    }
}