package Leetcodes;

import java.util.HashMap;
import java.util.Map;

public class numDecodings {
    public static int numDecodings(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        dp[0] = 1;

        for(int i=0; i<n; i++){
            if(s.charAt(i) == '0'){
                if (i > 0 && (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2')) {
                    dp[i+1] = dp[i-1];
                }else{
                    return 0;
                }
            }
            // Only assign dp[i+1] to dp[i] if the current character is not '0'
            if (s.charAt(i) != '0') {
                dp[i+1] = dp[i];
            } else {
                dp[i+1] = 0;
            }
            if (i > 0 && (s.charAt(i - 1) == '1' || (s.charAt(i - 1) == '2' && s.charAt(i) <= '6'))) {
                dp[i+1] += dp[i-1];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numDecodings("10"));
    }
}
