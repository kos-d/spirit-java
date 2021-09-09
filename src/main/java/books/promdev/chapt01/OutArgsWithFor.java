package books.promdev.chapt01;

public class OutArgsWithFor {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Arg-> " + args[i]);
        }
    }
}