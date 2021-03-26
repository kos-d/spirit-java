package module03.homework.autocheck;

import java.util.Arrays;

public class UberShop {
    public void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + " jup.");
        }
        /*
    public void printPrices(float[] prices) {
        for(float price: prices) {
            System.out.println(price + " jup.");
        }
    }
         */
    }
        public void multiplyPrices(float[] prices) {
            for (int i = 0; i < prices.length; i++) {
                if (prices[i] < 1000) {
                    prices[i] *= 2;
                } else if(prices[i] >= 1000) {
                    prices[i] *= 1.5;
                }
            }
        }
        /*
        public void multiplyPrices(float[] prices) {
        for(int i = 0; i < prices.length; i++) {
            float price = prices[i];

            if (price < 1000) {
                price *= 2f;
            } else {
                price *= 1.5f;
            }

            prices[i] = price;
        }
    }
         */
    public int[] findMinMaxPrices(int[] prices) {
        int[] zero;
        zero = new int[0];

        if (prices.length == 0) {
            return zero;
        }

        int minPrice;
        minPrice = prices[0];
        int maxPrice;
        maxPrice= prices[0];

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrice){
                minPrice = prices[i];

            } else if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
        }
        if (minPrice == maxPrice) {
            return new int[] {maxPrice};
        } else {
            return new int[] {minPrice, maxPrice};
        }
    }
    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int minPrice = prices[0];
        int count = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == minPrice) {
                count++;
            }
        }
        return count;
    }
    /*
    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = prices[0];
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }

        int result = 0;
        for(int i = 0; i < prices.length; i++) {
            if (prices[i] == min) {
                result++;
            }
        }

        return result;
    }
     */
    public int[] removePrice(int[] prices, int toRemove) {
        int result = 0;
        int tmp = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == toRemove) {
                result++;
            }
        }
        int[] newPrices = new int[prices.length - result];

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                newPrices[tmp] = prices[i];
                tmp++;
            }
        }
        return newPrices;
    }
    /*
    public int[] removePrice(int[] prices, int toRemove) {
        int toRemoveCount = 0;
        for(int price: prices) {
            if (price == toRemove) {
                toRemoveCount++;
            }
        }

        int[] result = new int[prices.length - toRemoveCount];
        int index = 0;
        for(int price: prices) {
            if (price != toRemove) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }
     */
    public int[] leavePrice9(int[] prices) {
        int count = 0;
        for (int i =0; i < prices.length; i++) {
            if(prices[i] % 10 != 9) {
                count++;
            }
        }
        int[] result = new int[prices.length - count];
        int index = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] % 10 == 9) {
                result[index] = prices[i];
                index++;
            }
        }

        return result;
    }
    /*
    public int[] leavePrice9(int[] prices) {
        int validPriceCount = 0;
        for(int price: prices) {
            if (price%10 == 9) {
                validPriceCount++;
            }
        }

        int[] result = new int[validPriceCount];
        int index = 0;
        for(int price: prices) {
            if (price%10 == 9) {
                result[index] = price;
                index++;
            }
        }

        return result;
    }
     */
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] mergedStocks = Arrays.copyOf(showcaseStocks, showcaseStocks.length + warehouseStocks.length);
        int count = showcaseStocks.length;

        for (int i = 0; i < warehouseStocks.length; i++) {
            mergedStocks[count] = warehouseStocks[i];
            count++;
        }
        return mergedStocks;
    }
    /*
    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        String[] result = new String[showcaseStocks.length + warehouseStocks.length];

        int index = 0;
        for(String stock: showcaseStocks) {
            result[index] = stock;
            index++;
        }

        for(String stock: warehouseStocks) {
            result[index] = stock;
            index++;
        }

        return result;
    }
     */
    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int result = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= minPrice && prices[i] <= maxPrice) {
                result += prices[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //float[] prices = new float[] {100f, 23.5f, 400f};
        //shop.printPrices(prices);

        //float[] prices = new float[] {100f, 1500f};
        //shop.multiplyPrices(prices);
        //System.out.println(Arrays.toString(prices));

        //int[] prices = new int[] {100, 1500, 300, 50};
        //int[] minMax = shop.findMinMaxPrices(prices);
        //System.out.println(Arrays.toString(minMax));

        //int[] prices1 = new int[] {10, 50, 3, 1550};
        //int[] minMax1 = shop.findMinMaxPrices(prices1);
        //System.out.println(Arrays.toString(minMax1));

        //int[] prices2 = new int[] {1, 99, 5, 49};
        //int[] minMax2 = shop.findMinMaxPrices(prices2);
        //System.out.println(Arrays.toString(minMax2));

        System.out.println(Arrays.toString(shop.findMinMaxPrices(new int[] {})));

        System.out.println(Arrays.toString(shop.findMinMaxPrices(new int[] {50, 50})));

        //int[] prices = new int[] {100, 1500, 300, 50, 10, 10, 70};
        //System.out.println(shop.getMinPriceCount(prices));

        //int[] prices = new int[]{150, 100, 200};
        //int toRemove = 100;
        //System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));

        //int[] prices1 = new int[]{100, 100, 100};
        //System.out.println(Arrays.toString(shop.removePrice(prices1, toRemove)));

        //int[] prices = new int[] {399, 1599, 399, 50, 10, 10, 70};
        //System.out.println(Arrays.toString(shop.leavePrice9(prices)));

        String[] showcaseStocks = new String[]{"gun", "firebow"};
        String[] warehouseStocks = new String[]{"firegun"};

        System.out.println(Arrays.toString(shop.mergeStocks(showcaseStocks, warehouseStocks)));

        int[] prices = new int[]{10, 20, 50, 40, 34, 500};
        System.out.println(shop.getPricesSum(prices, 20, 50));
    }
}
