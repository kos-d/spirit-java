package books.promdev.chapt04;

public class Employee {
    private int id;
    
    public Employee(int idc) {
        super();
        id = idc;
    }
    
    public int getId() {
        return id;
    }
    
    public void typeEmployee() {
        System.out.println("Worker");
    }
}