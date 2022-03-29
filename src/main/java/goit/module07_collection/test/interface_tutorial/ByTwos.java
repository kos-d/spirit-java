package goit.module07_collection.test.interface_tutorial;

public class ByTwos implements Series {
    
    int val;
    
    ByTwos() {
        val = 0;
    }

//    @Override
//    public int getNext() {
//        val += 2;
//        return val;
//    }
    @Override
    public int getNext() {
        if (val >= MAX) {
            System.out.println(ERRORMSG);
        } else {
            val += 2;
        }
        return val;
    }
    
    public int getPrev() {
        val -= 2;
        return val;
    }
    
//    public void printStuff() {
//        System.out.println("I am the ByTwos class.");
//    }
}