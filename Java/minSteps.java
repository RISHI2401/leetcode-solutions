package Leetcodes;

import javax.sound.midi.Soundbank;
import java.util.*;

public class minSteps {

//    public static int minSteps(String s, String t){
//        Map<Character, Integer> sMap = new HashMap<>();
//        Map<Character, Integer> tMap = new HashMap<>();
//        for(char c : s.toCharArray()){
//            sMap.put(c, sMap.getOrDefault(c,0)+1);
//        }
//        for(char c : t.toCharArray()){
//            tMap.put(c, tMap.getOrDefault(c, 0)+1);
//        }
//        int countSteps=0;
//        for(char c : tMap.keySet()){
//            int freqS = sMap.getOrDefault(c, 0);
//            int freqT = tMap.get(c);
//            countSteps += Math.max(0, freqT-freqS);
//        }
//        return countSteps;
//    }

    public static int minSteps(String s, String t){
        int[] arrayS = new int[26];
        int[] arrayT = new int[26];

        for(char c : s.toCharArray()){
            arrayS[c - 'a']++;
        }
        for(char c : t.toCharArray()){
            arrayT[c - 'a']++;
        }
        int totalSteps = 0;
        for(int i =0; i<26; i++){
            int diff = arrayT[i] - arrayS[i];
            totalSteps += Math.max(0, diff);
        }
        return totalSteps;
    }


    public static void main(String[] args) {
        System.out.println(minSteps("leetcode", "practice"));
        System.out.println(minSteps("bab", "aba"));
        System.out.println(minSteps("anagram", "mangaar"));
    }
}
