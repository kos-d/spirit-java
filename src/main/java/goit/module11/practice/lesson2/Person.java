package goit.module11.practice.lesson2;

import java.util.Objects;

//@Data !!!!

//@Value // final field

//@Builder
//@NoArgsConstructor
//@RequiredArgsConstructor  field final

//@AllArgsConstructor

//@Getter
//@Setter

//@Getter(AccessLevel.PROTECTED)
//@Getter(AccessLevel.NONE)

//@EqualsAndHashCode(exclude = "surname")
//@ToString(exclude = "surname")



//import java.lang.annotation.ElementType; import java.lang.annotation.Retention; import java.lang.annotation.RetentionPolicy; import java.lang.annotation.Target; @Target({ElementType.TYPE}) @Retention(RetentionPolicy.RUNTIME) public @interface Repeat { int value(); } 
//compile group: 'org.projectlombok', name: 'lombok', version: '1.18.12' annotationProcessor 'org.projectlombok:lombok:1.18.12'
public class Person {
    
    //@Getter(AccessLevel.NONE)
    private String name;
    
    private String surname;
    
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.age);
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
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.age, other.age)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }
    
//    Person p = Person.builder()
//            .age(5);
//            .name("name");
//            .surname("surname");
//            .build();
    
}