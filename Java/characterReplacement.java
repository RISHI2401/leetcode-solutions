package Leetcodes;

import java.util.HashMap;

public class characterReplacement {
    public static int characterReplacement(String s, int k){
        // Solving it using two pointers
        int max_length = 0;
        int max_count = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++){
            char rightChar = s.charAt(right);
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
            max_count = Math.max(max_count, map.get(rightChar));

            // If the current window size minus the count of the most frequent character is greater than k, shrink the window
            if(((right - left + 1) - max_count) > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                left++;
            }
            max_length = Math.max(max_length, right-left+1);
        }
        return max_length;
    }

    public static void main(String[] args) {
        String s  = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }
}
