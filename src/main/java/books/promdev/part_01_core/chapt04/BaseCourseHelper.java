package books.promdev.part_01_core.chapt04;

public class BaseCourseHelper extends CourseHelper {
    public BaseCourse getCourse() {
        System.out.println("BaseCourse");
        return new BaseCourse();
    }
}