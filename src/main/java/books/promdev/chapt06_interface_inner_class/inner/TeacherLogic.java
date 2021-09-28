package books.promdev.chapt06_interface_inner_class.inner;

public class TeacherLogic {
    public static void excludeProcess(int deanId, String name) {
        AbstractTeacher teacher = new TeacherCreator().createTeacher(deanId);
        
        System.out.println("Student: " + name + " offline: " + teacher.excludeStudent(name));
    }
    public static void main(String[] args) {
        excludeProcess(700, "Balaganov");
        excludeProcess(777, "Balaganov");
    }
}