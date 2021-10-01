package books.promdev.part_01_core.chapt01;

public class User {
    private int numericCode;
    private String password;
    
    public void setNumericCode(int value) {
        if (value > 0) numericCode = value;
        else numericCode = 1;
    }
    
    public int getNumericCode() {
        return numericCode;
    }
    
    public void setPassword(String pass) {
        if (pass != null) password = pass;
        else password = "11111";
    }
    
    public String getPassword() {
        return password;
    }
}