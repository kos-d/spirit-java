package books.promdev.part_01_core.chapt04.finalizationDemo;

public class Manager {
    private int id;
    
    public Manager(int value) {
        id = value;
    }
    
    protected void finalize() throws Throwable {
        try {
            System.out.println("the object will be deleted, id = " + id);
        } finally {
            super.finalize();
        }
    }
}