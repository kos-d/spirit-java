package books.promdev.chapt06_interface_inner_class.inner;

public class AnySession {
    public static void main(String[] args) {
        Student stud = new Student(822201);
        String[] ex= { "Mecanica", "Programming" };
        int[] marks = { 2, 9 };
        stud.setExam(ex, marks);
        System.out.println(stud);
    }
}