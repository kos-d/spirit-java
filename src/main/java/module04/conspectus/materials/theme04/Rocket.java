package module04.conspectus.materials.theme04;

public class Rocket {
    public String serialNumber;     // public
    int engine;                     // package-default
    
    
    public static void main(String[] args) {
        Phone phone = new Phone();
        String printName = phone.printName("axe");
        System.out.println(printName);
    }
}

class Stock {
    protected String name;          // protected
}

class Phone extends Stock {
    public String printName(String name) {
        System.out.println(this.name);
        return this.name;
    }
}