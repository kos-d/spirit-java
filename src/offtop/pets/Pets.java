package offtop.pets;

public abstract class Pets {

    private int size;
    private String breed;
    private String name;
    private int age;

    private int x;
    private int y;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getString() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;
    }
    public abstract String voice();

    public String toString(){
        return "Pets { size " + size + " breed " + breed + "name" + name + "age " + age + " }";
    }
}
