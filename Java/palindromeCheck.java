package Leetcodes;

public class palindromeCheck {
    public static boolean check(String s){
        boolean ans = false;
        int right_pointer = s.length() - 1;
        int left_pointer = 0;
        while(left_pointer < s.length()/2){
            if(s.charAt(left_pointer++) == s.charAt(right_pointer--)){
                ans = true;
            }else{
                ans = false;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "77bb77";
        boolean ans = check(s);
        System.out.println(ans);

    }
}
