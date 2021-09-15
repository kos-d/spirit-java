package books.promdev.chapt03;

public enum Dean {
    MMF("Bender"), FPMI("Balaganov"), GEO("Kozlevich");
    String name;
    
    Dean(String arg) {
        name = arg;
    }
    String getName() {
        return name;
    }
}