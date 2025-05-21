package Leetcodes;

import java.util.*;

public class isIsomorphic {
    public static boolean isIsomorphic(String s, String t){
        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Character> s_to_t = new HashMap<>();
        Set<Character> mapped_t = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char char_s = s.charAt(i);
            char char_t = t.charAt(i);

            if(s_to_t.containsKey(char_s)){
                if(s_to_t.get(char_s) != char_t){
                    return false;
                }
            }else{
                if(mapped_t.contains(char_t)){
                    return false;
                }
            }
            s_to_t.put(char_s, char_t);
            mapped_t.add(char_t);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "foe";
        Boolean result = isIsomorphic(s, t);
        System.out.println(result);
    }
}
