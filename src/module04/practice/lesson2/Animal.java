package module04.practice.lesson2;

import java.util.Objects;

public abstract class Animal {
    
   // private static int numb = 0;
    
//    private final int age;
    
    private String name;
    
    private int x;
    
    private int y;
    
//    public Animal() {
//        numb++;
//    }
    
//    public Animal(int age) {
//        this.age = age;
//    }
    
    public void move(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }
    //=========================================
    // pattern
    // Template Method
    
    public String templateMethod() {
        String str = "from templateMethod";
        String voice = voice();
        return voice + " " + str;
    }
    
    protected abstract String voice();
    
    public int test1(int x, int y) {
        //int z = y * 10;
        int z = test3(y);
        return z * x;
    }
    public int test2(int x, int y) {
        //int z = y * 10;
        int z = test3(y);
        return z / x;
    }
    private int test3(int y) {        
        return y * 10;
    }
            
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Animal{" + "name=" + 
                name + ", x=" + 
                x + ", y=" + 
                y + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.name);
        hash = 83 * hash + this.x;
        hash = 83 * hash + this.y;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
}