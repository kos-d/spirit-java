package module05.practice;


import java.util.Objects;

public abstract class Animal {
    
    private String name;
    
    private int x;
    
    private int y;
    
    public void move(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    /*
    public String test() {
        String s = "...";
        String voice = voice();
        return voice + s;
    }
    */
    //protected abstract String voice();
    public abstract String voice();

    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", x=" + x + ", y=" + y + '}';
    }
    
    
}