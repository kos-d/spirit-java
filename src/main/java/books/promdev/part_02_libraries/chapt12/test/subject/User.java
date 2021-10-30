package books.promdev.part_02_libraries.chapt12.test.subject;

import java.util.concurrent.atomic.AtomicInteger;

public class User extends Human implements Comparable<User>{
    private int id;   
    
    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    
    private final int numb;
    
    public User() {        
        numb = COUNTER.getAndIncrement();
    }
    
    public User(String name, int age, int id) {
        super(name, age);
        this.id = id;
        numb = COUNTER.getAndIncrement();
        
    }
   
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    
    public int getNumb() {
        return numb;
    }
    
    @Override
    public String toString() {        
        return "[User " + getNumb() + ": "  + getName() + ", age: " + getAge() + ", id: " + getId() + "]"+ '\n';
    }

    @Override
    public int compareTo(User user) {
        if (id > user.getAge()) {
            return 1;
        } else if (id < user.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
