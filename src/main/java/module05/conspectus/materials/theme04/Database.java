package module05.conspectus.materials.theme04;

public class Database {
    private static final Database database = new Database();
    
    private Database() {
        
    }
    
    public static Database getInstance() {
        return database;
    }
    
    public Object getData() {
        return "test";
    }
}