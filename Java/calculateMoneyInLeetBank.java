package Leetcodes;

public class calculateMoneyInLeetBank {
    public static int totalMoney(int n) {
        int money_save = 0;
        int money = 0;
        while (n != 0) {
            if (n <= 7) {
                money_save += 1;
                money += money_save;
                n--;
            } else if (n == 8) {
                money_save = 2 + 1;
                money += money_save;
            }
            n--;
        }
        return money;
    }

    public static void main(String[] args) {
        
    }
}
