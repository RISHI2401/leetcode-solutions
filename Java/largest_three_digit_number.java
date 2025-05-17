package Leetcodes;
public class largest_three_digit_number {
    public static  String largestGoodInteger(String s){
        for(int i = 9; i>=0; i--){
            String sub = String.format("%d%d%d", i, i, i);

            if(s.contains(sub)) return sub;
        }
        return"";
    }

    public static void main(String[] args) {
        System.out.println(largestGoodInteger("111018"));
    }
}

