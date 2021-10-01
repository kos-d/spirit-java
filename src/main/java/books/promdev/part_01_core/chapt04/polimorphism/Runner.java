package books.promdev.part_01_core.chapt04.polimorphism;

public class Runner {
    public static void main(String[] args) {
        DynDispatcher d = new DynDispatcher();
        Course course = new Course(7, "MA");
        d.infoCourse(course);
        BaseCourse baseCourse = new BaseCourse(71, "MP", 2531);
        d.infoCourse(baseCourse);
        OptionalCourse optionalCourse = new OptionalCourse(35, "FA", 4128, true);
        d.infoCourse(optionalCourse);
    }
}