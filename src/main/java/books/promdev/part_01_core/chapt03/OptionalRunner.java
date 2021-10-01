package books.promdev.part_01_core.chapt03;

public class OptionalRunner {
    public static void main(String[] args) {
        Optional<Integer> ob1 = new Optional<>();
        
        ob1.setValue(1);
        int v1 = ob1.getValue();
        System.out.println(v1);
        
        Optional<String> ob2 = new Optional<>("Java");
        String v2 = ob2.getValue();
        System.out.println(v2);
        
        Optional ob3 = new Optional();
        System.out.println(ob3.getValue());
        ob3.setValue("Java SE 6");
        System.out.println(ob3.toString());
        
        ob3.setValue(71);
        System.out.println(ob3.toString());
        
//        ob3.setValue(null);
//        System.out.println(ob3.toString());
    }
}