package Leetcodes;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s){

        /*

        // THIS IS THE BRUTE FORCE APPROACH WITH A TIME COMPLEXITY OF O(n^2).

        int max_length = 0;
        if(s.length() == 0) return 0;
        char[] chars = s.toCharArray();

        for(int i=0; i<chars.length; i++){
            Set<Character> set = new HashSet<>();
            int j = i;
            while(j < chars.length && set.add(chars[j])){
                j++;
            }
            max_length = Math.max(max_length, j-i);
        }
        return max_length;

         */

        // A BETTTER APPROACH TO DO THIS QUESITON WOULD BE SLIDING WINDOWS APPROACH

        int left = 0, right = 0, max_length = 0;
        char[] chars = s.toCharArray();
        //I could have also used s.charAt() simply and that would have saved some space
        Set<Character> set = new HashSet<>();

        while(right < s.length()){
            if(!set.contains(chars[right])){
                set.add(chars[right]);
                right++;
                max_length = Math.max(max_length, right-left);
            }else{
                set.remove(chars[left]);
                left++;
            }
        }
        return max_length;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
