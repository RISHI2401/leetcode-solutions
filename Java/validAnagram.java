package Leetcodes;

import java.util.*;

//WAY 1
//public class validAnagram {
//    public static boolean isAnagram(String s, String t){
//        if(s.length() == t.length()){
//            char[] sc = s.toCharArray();
//            char[] tc = t.toCharArray();
//            Arrays.sort(sc);
//            Arrays.sort(tc);
//            if(Arrays.equals(sc,tc)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isAnagram("anagram", "naaram"));
//    }
//}

// Way 2

class validAnagram{
    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()){ return false; }
        Map<Character, Integer> charCount = new HashMap<>();
        for(char c : s.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c,0)+1);
        }
        for(char c : t.toCharArray()) {
            int count = charCount.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }else{
                charCount.put(c, count - 1);
            }
        }
        for(int count : charCount.values()){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
