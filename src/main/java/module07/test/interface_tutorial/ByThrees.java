package module07.test.interface_tutorial;

public class ByThrees implements Series {
    int val;
    
    ByThrees() {
        val = 0;
    }

    @Override
    public int getNext() {
        val += 3;
        return val;
    }
}