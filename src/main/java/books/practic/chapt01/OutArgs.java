package books.practic.chapt01;

public class OutArgs {
    public static void main(String[] args) {
        for (int j = 0; j < args.length; j++) {
            System.out.println("Arg # " + j + "-> " + args[j]);
        }
    }
}