package books.practic.chapt01;

public class SubjectDemo {
    public static void main(String[] args) {
        Subject ob = new Subject("Bob");
        ob.name = "Spanch Bob";
        ob.setAge(19);
        ob.show();
    }
}