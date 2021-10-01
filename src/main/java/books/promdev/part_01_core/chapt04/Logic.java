package books.promdev.part_01_core.chapt04;

public class Logic {
    public static void main(String[] args) {
        Course objA = new BaseCourse();
        BaseCourse objB = new BaseCourse();
        System.out.println("objA: id = " + objA.id);
        System.out.println("objB: id = " + objB.id);
        Course objC = new Course();
        
        int id = ((BaseCourse) objA).id;
        int id2 = ((Course) objB).id;
        
        System.out.println(id);
        System.out.println(id2);
    }
}