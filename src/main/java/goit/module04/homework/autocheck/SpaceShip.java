package goit.module04.homework.autocheck;

public class SpaceShip {
    //public String name = "Voyager";
    private String name;
    private String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        if (serialNumber.startsWith("SN") && serialNumber.length() == 8) {
            this.serialNumber = serialNumber;
        }
    }
    /*
    public void setSerialNumber(String serialNumber) {
        if (serialNumber.length() != 8) {
            return;
        }

        if (!serialNumber.startsWith("SN")) {
            return;
        }

        this.serialNumber = serialNumber;
    }
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty() && name.length() <= 100) {
            this.name = name;
        }
    }
    /*
    public void setName(String name) {
        if (!name.isBlank() && name.length() <= 100) {
            this.name = name;
        }
    }
    public void setName(String name) {
        if (name.isBlank() || name.length() > 100) {
            return;
        }

        this.name = name;
    }
     */

    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        System.out.println(ship.getName());
        ship.setName("Walker");
        System.out.println(ship.getName());

        ship.setSerialNumber("SN506788");
        System.out.println(ship.getSerialNumber());

        ship.printInfo();
    }

    public void printInfo() {
        System.out.println("Name is " + getName() + ", serial number is " + getSerialNumber());
    }
}
