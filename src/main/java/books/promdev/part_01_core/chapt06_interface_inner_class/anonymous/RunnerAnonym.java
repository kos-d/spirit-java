package books.promdev.part_01_core.chapt06_interface_inner_class.anonymous;

public class RunnerAnonym {
    public static void main(String[] args) {
        TypeQuest unique = new TypeQuest() {
            public void addNewType() {
                System.out.println("add quest free");
            }
        };
        unique.addNewType();
        
        new TypeQuest(71) {
            private String name = "Drag&Drop";
            
            public void addNewType() {
                System.out.println("add " + getName());
            }
            String getName() {
                return name;
            }
        }.addNewType();
        TypeQuest standard = new TypeQuest(35);
        standard.addNewType();
    }
}