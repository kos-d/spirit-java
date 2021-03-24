package module04.homework.autocheck;

abstract class Passenger {
    public abstract String getType();
    public abstract int getTicketPrice();
}

class RegularPassenger extends Passenger {
    @Override
    public String getType() {
        String typePassenger = "Regular";
        return typePassenger;
    }
    @Override
    public int getTicketPrice() {
        int ticketPrice = 199;
        return ticketPrice;
    }
}
class VIPPassenger extends Passenger {
    @Override
    public String getType() {
        String typePassenger = "VIP";
        return typePassenger;
    }
    @Override
    public int getTicketPrice() {
        int ticketPrice = 399;
        return ticketPrice;
    }
}
