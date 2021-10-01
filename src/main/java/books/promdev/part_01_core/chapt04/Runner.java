package books.promdev.part_01_core.chapt04;

public class Runner {
    public static void main(String[] args) {
        Employee b1 = new Employee(7110);
        Employee b2 = new Manager(9251, 31);
        b1.typeEmployee();
        b2.typeEmployee();
        int idProject = ((Manager) b2).getIdProject();
        Manager b3 = new Manager(9711, 35);
        System.out.println(b3.getIdProject());
        System.out.println(b3.getId());
    }
}