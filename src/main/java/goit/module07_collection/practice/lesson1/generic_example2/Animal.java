package goit.module07_collection.practice.lesson1.generic_example2;

import java.util.Objects;

public abstract class Animal<T> implements IAnimal<T>{
    
//    public static Animal of() {
//        Animal animal;
//        if (Resources.ANIMAL.equalsIgnoreCase("CAT")) {
//            animal = new Cat();
//        } else if (Resources.ANIMAL.equalsIgnoreCase("DOG")) {
//            animal = new Dog();
//        } else animal = new Animal() {
//            @Override
//            public String voice() {
//                return "uuu";
//            }
//        };
//        return animal;
//    }
    
    private String name;
    
    private int x;
    
    private int y;
    
    //@Override
    public void move(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }
    
//    public abstract  String voice();
//    
//    public abstract  String description();
    
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