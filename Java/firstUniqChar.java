package Leetcodes;

import java.util.HashMap;
import java.util.Map;

public class firstUniqChar {
    //returns the index of the first unique character aka non-repeating one
    public static int firstUniqChar(String s){
//        Map<Character, Integer> map = new HashMap<>();
//        for(char c : s.toCharArray()){
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        for(int i=0; i<s.length(); i++){
//            if(map.get(s.charAt(i)) == 1){
//                return i;
//            }
//        }
//        return -1;

        int[] frequency = new int[26];
        char[] chars = s.toCharArray();

        for(char c : chars){
            frequency[c - 'a']++;
        }
        for(int i =0; i<chars.length; i++){
            if(frequency[chars[i] - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode"));
    }
}

