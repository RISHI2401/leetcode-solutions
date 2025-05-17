package Leetcodes;

import java.util.ArrayList;
import java.util.List;

public class firstPalindrome {
    public static String firstPalindrome(String[] words){

        List<String> all = new ArrayList<>();
        for(String word : words){
            if(isPalindrom(word)){
                all.add(word);
            }
        }
        return all.isEmpty() ? "" : all.get(0);
    }

    private static boolean isPalindrom(String word){
        int length = word.length();
        if (length == 1){
            return true;
        }
        int left = 0;
        int right = word.length()-1;

        while(left < length/2){
            if(word.charAt(left++) != word.charAt(right--)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words1 = {"abc","car","ada","racecar","cool"};
        String[] words2 = {"notapalindrome","racecar"};
        System.out.println(firstPalindrome(words1));
        System.out.println(firstPalindrome(words2));
    }
}
