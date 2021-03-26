package module03.homework.autocheck;

public class CheapStocks {

    public String getCheapStocks(String[] stocks) {
        String cheapCommodity = "";
        for (int i = 0; i < stocks.length; i++) {
            String[] value = stocks[i].split(" ");
            int price = Integer.parseInt(value[1]);
            if (price < 200) {
                cheapCommodity = cheapCommodity + " " + value[0];
            }
        }
        return cheapCommodity;
    }

    public static void main(String[] args) {
        CheapStocks cheapStocks = new CheapStocks();

        String[] stocks = new String[] {"gun 500", "firebow 70", "pixboom 200"};
        System.out.println(cheapStocks.getCheapStocks(stocks));

    }
}
