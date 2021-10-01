package books.promdev.part_01_core.chapt04;

public class RunnerCourse {
    public static void main(String[] args) {
        CourseHelper bch = new BaseCourseHelper();
        Course course = bch.getCourse();
        System.out.println(bch.getCourse().id);
    }
}