package Leetcodes;

public class mergeAlternately {
    public static String mergeAlternately(String word1, String word2){

        StringBuilder res = new StringBuilder();
        int i = 0; int j = 0;

        while(i < word1.length() && j < word2.length()){
            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));
        }

        while(i < word1.length()){
            res.append(word1.charAt(i++));
        }
        while(j < word2.length()){
            res.append(word2.charAt(j++));
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";

        System.out.println(mergeAlternately(word1, word2));
    }
}
