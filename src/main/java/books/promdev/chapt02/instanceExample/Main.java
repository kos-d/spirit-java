package books.promdev.chapt02.instanceExample;

public class Main {
    public static void main(String[] args) {
        
        BaseCourse baseCourse = new BaseCourse();
        FreeCourse freeCourse = new FreeCourse();
        OptionalCourse optionalCourse = new OptionalCourse();
//        doLogic(baseCourse);
        doLogic(freeCourse);
//        doLogic(optionalCourse);
    }
    
    public static void doLogic(Course c) {
        
        try {
            if (c instanceof BaseCourse) {
            System.out.println("BaseCourse, FreeCourse");
            } else if (c instanceof OptionalCourse) {
                System.out.println("OptionaCourse");
            } else {
                System.out.println("Course");
            }
        } catch (ExceptionInInitializerError e) {
            e.printStackTrace();
        }
    }
}