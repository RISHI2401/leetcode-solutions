package Leetcodes;

import java.util.*;

public class customSortString {
    public static String customSortString(String order, String s){
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : order.toCharArray()){
            if(map.containsKey(c)){
                result.append(String.valueOf(c).repeat(Math.max(0, map.get(c))));
                map.remove(c);
            }
        }
        for(char c : map.keySet()){
            result.append(String.valueOf(c).repeat(Math.max(0, map.get(c))));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String order = "kqep";
        String s = "pekeq";
        System.out.println(customSortString(order, s));
    }
}
