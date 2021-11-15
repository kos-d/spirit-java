package books.practic.chapt01;

public class Subject {

    public String name;
    private int age;

    public Subject() {
        name = "NoName";
        age = 0;
    }

    public Subject(String n) {
        this.name = n;
    }
    
    public void setAge(int a) {
        this.age = a;
    }
    
    public int getAge() {
        return age;
    }
    
    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
