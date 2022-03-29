package goit.module04.conspectus.materials.theme03;

public class Rocket {
    private String serialNumber;
    
    public String getSerialNumber() {
        return serialNumber;
    }
    
    public void setSerialNumber(String serialNumber) {
        if (serialNumber != null && !serialNumber.isEmpty()) {
            this.serialNumber = serialNumber;
        }
    }
}