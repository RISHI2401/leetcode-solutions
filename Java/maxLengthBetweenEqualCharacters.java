package Leetcodes;

import java.util.HashMap;

public class maxLengthBetweenEqualCharacters {

    public static int maxLengthBetweenEqualCharacters(String s) {
        int ans = -1;
        for (int left = 0; left < s.length(); left++) {
            for (int right = left + 1; right < s.length(); right++) {
                if (s.charAt(left) == s.charAt(right)) {
                    ans = Math.max(ans, right - left - 1);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "aa";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
}
