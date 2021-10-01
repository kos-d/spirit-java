package books.promdev.part_01_core.chapt04.cloneExampleDeep;

public class Runner {
    private static void changeId(Student p) {
        p = (Student) p.clone();
        p.setId(100);
        System.out.println("id = " + p.getId());
    }
    
    public static void main(String[] args) {
        Student ob1 = new Student();
        System.out.println("id = " + ob1.getId());
        changeId(ob1);
        System.out.println("id = " + ob1.getId());
    }
}