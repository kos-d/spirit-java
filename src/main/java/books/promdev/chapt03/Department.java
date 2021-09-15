package books.promdev.chapt03;

public class Department {
    private int id;
    
    {
        System.out.println("logic (1) id= " + this.id);
    }
    static {
        System.out.println("static logic");
    }
    
    public Department(int d) {
        this.id = d;
        System.out.println("constructor id = " + id);
    }
    int getId() {
        return id;
    }
    {
        id = 10;
        System.out.println("logic (2) id = " + id);
    }
}