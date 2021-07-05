package module04.conspectus.materials.theme03;

public class RocketLauncher {
    public static void main(String[] args) {
        Rocket rocket = new Rocket();
        rocket.setSerialNumber("SN123");
        System.out.println(rocket.getSerialNumber());
        rocket.setSerialNumber("");
        
    }
}