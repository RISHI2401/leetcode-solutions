package Leetcodes;

public class makeEqual {
    public static boolean makeEqual(String[] words) {
        if(words.length == 0){
            return true;
        }
        int totalCharCount = 0;
        for(String s : words){
            totalCharCount += s.length();
        }
        if(totalCharCount % words.length != 0){
            return false;
        }
        int[] myMap = new int[26];
        for(String s : words){
            for(char c : s.toCharArray()){
                myMap[c - 'a']++;
            }
        }
        for(int i : myMap){
            if(i % words.length != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abc","aabc","bc"};
        System.out.println(makeEqual(words));
    }
}
