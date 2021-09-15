package books.promdev.chapt01.homework;

public class Main {
    public static void main(String[] args) {
        for (int i = args.length-1; i >=0; i--) {
            System.out.println("Args-> " + args[i]);
        }
    }
}