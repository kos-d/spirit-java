package module06.practice.sortObjects;

public class People implements Comparable<People>{
    
    private String name;
    private String sureName;
    private Integer age;

    public People(String name, String sureName, int age) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" + "name=" + name + ", sureName=" + sureName + ", age=" + age + '}';
    }

    @Override
    public int compareTo(People people) {
        //boolean equals = age.equals(people.getAge());
        if (age > people.getAge()) {    
            return 1;                   // -1 revers sort
        }
        if (age < people.getAge()) {
            return -1;                  // 1
        }
        return 0;
        //int compare = Integer.compare(age, people.getAge());
    }
}