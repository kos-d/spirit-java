package books.promdev.chapt04;

public class Manager extends Employee {
    private int idProject;
    
    public Manager(int idc, int idp) {
        super(idc);
        idProject = idp;
    }
    public int getIdProject() {
        return idProject;
    }
    
    public void typeEmployee() {
        System.out.println("Manager");
    }
}