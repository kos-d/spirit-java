package module06.conspectus.video.lesson01;

import java.util.Arrays;

public class StringExample {
    //immutable
    //mutable
    public static void main(String[] args) {
        
//        String changed = "123" + "hello" + "world";
//        String newString = changed.replace("1", "new");
//        System.out.println(changed);
//        System.out.println(newString);

        Student student = new Student("testFirstName", "testLastName");
        String[] lessons = student.getLessons();
        lessons[1] = "Mathematic";
        student.setFirstName("SuperNova");
        
        String toString = Arrays.toString(student.getLessons());        
        System.out.println(toString);
        
        System.out.println(student.getFirstName());
    }
}