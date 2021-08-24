package module06.practice.lesson1.sort_objects;

public class People {//implements Comparable<People>{
    
    private String name;
    private String sureName;
    private Integer age;

    public People(String name, String sureName, int age) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
    }

    public People() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

//    @Override
//    public int compareTo(People people) {
//        //boolean equals = age.equals(people.getAge());
//        if (age > people.getAge()) {
//            return 1;
//        } else if (age < people.getAge()) {
//            return -1;
//        } else {
//            return 0;
//        }
////         int compare = Integer.compare(age, people.getAge());
////         return compare;
//    }
}