package books.promdev.part_01_core.chapt04;

public class StudentEq {
    public static void main(String[] args) {
        Student p1 = new Student(71, "Petrov", 19);
        Student p2 = new Student(71, "Petrov", 19);
        Student p3 = new SubStudent(71, "Petrov", 19, 5);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p3.equals(p1));
    }
}