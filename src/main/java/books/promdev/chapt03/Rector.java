package books.promdev.chapt03;

public class Rector {
    final int ID = (int) (Math.random() * 10);
    
    final String NAME_RECTOR;
    
    public Rector() {
        NAME_RECTOR = "Old";
    }
//    {NAME_RECTOR = "New";}
    public final void jobRector() {
        
    }
    
    public boolean checkRights(final int num) {
        final int CODE = 72173394;
        if (CODE == num) return true;
        else return false;
    }
    
    public static void main(String[] args) {
        System.out.println(new Rector().ID);
    }
}