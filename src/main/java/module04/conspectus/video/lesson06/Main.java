package module04.conspectus.video.lesson06;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(18, "Oleksandr", "gmail.com");
        System.out.println(person.toString());
        
        Printer printer = new Printer();
        printer.print("25s");
        printer.print(20);
    }
}