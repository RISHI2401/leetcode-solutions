package Leetcodes;

public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] words){
        if (words.length == 0){
            return "";
        }
        String prefix = words[0];

        for(int i=1; i<words.length; i++){
            String word = words[i];
            while (!word.startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flight"};
        String answer = longestCommonPrefix(words);
        System.out.println(answer);
    }
}
