package books.promdev.chapt03;

public class MarvRunner {
    public static void main(String[] args) {
        Marv<Double> md = new Marv<>(71.4D);
        System.out.println(md.sameAny(md));
        Marv<Integer> mi = new Marv<>(71);
        System.out.println(md.sameAny(mi));
        
        System.out.println(md.roundMarv());
    }
}