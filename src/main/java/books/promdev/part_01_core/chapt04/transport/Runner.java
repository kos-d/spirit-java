package books.promdev.part_01_core.chapt04.transport;

public class Runner {
    public static void main(String[] args) {
        RepairingFactory rc = new RepairingFactory();
        Transport[] box = new Transport[15];
        
        for (int i = 0; i < box.length; i++) 
            box[i] = rc.getClassFromFactory(3);
            for (Transport s : box) 
                s.repair();        
    }
}