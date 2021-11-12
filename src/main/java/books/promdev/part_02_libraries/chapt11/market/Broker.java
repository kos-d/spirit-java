package books.promdev.part_02_libraries.chapt11.market;

public class Broker extends Thread {
    private Market market;
    private static final int PAUSE = 500;
    public Broker(Market market) {
        this.market = market;
    }
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Current index: " + market.getIndex());
                Thread.sleep(PAUSE);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}