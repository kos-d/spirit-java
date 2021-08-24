package offtop.xml_parser_DOM.model;

import java.util.List;

public class Root {

    private String name;
    private List<People> people;

//    public Root(String name, List<People> people) {
//        this.name = name;
//        this.people = people;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//        public void setPeople(List<People> people) {
//        this.people = people;
//    }
    public void setName(String name) {
        this.name = name;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    public String getName() {
        return name;
    }

    public List<People> getPeople() {
        return people;
    }

    @Override
    public String toString() {
        return "Root{" + 
                "name=" + name + '\'' +
                ", people=" + people + 
                '}';
    }
}