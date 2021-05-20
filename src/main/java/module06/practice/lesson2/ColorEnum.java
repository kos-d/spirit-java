package module06.practice.lesson2;

public enum ColorEnum {
    BLUE (1, "#FG55%J"),
    GREEN (2, "#FG55%J"),
    RED (3, "#FG55%J");
    
    
    private final int number;
    private final String color;
    
    private ColorEnum(int number, String color) {
        this.color = color;
        this.number = number;
    }
    
    public String getColor() {
        return color;
    }
    
    public int getNumber() {
        return number;
    }
}
