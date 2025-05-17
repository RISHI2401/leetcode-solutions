package Leetcodes;

public class buyChoco {
    public static int buyChoco(int[] prices, int money) {

        int min = 1000;
        int secondMin = 1000;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                secondMin = min;
                min = prices[i];
            } else if (prices[i] < secondMin) {
                secondMin = prices[i];
            }
        }
        if((min + secondMin) <= money){
            return money - (min + secondMin);
        }
        return money;
    }

    public static void main(String[] args) {
        int[] prices = {98,54,6,34,66,63,52,39};
        int money = 62;
        System.out.println(buyChoco(prices,money));
    }
}
