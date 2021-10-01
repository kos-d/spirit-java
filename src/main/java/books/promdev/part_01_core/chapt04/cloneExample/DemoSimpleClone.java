package books.promdev.part_01_core.chapt04.cloneExample;

public class DemoSimpleClone {
    private static void changeId(Student p) {
        p = (Student) p.clone();
        p.setId(1000);
        System.out.println("-> id = " + p.getId());
    }
    public static void main(String[] args) {
        Student ob = new Student();
        System.out.println("id = " + ob.getId());
        changeId(ob);
        System.out.println("id = " + ob.getId());
    }
}