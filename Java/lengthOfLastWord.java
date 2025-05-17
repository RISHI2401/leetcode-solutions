package Leetcodes;

public class lengthOfLastWord {
    public static int lengthOfLastWord(String s){
        String trimmed = s.replaceAll("s\\+", " ").trim();
        int len = 0;
        for(int i = trimmed.length()-1; i >=0; i--){
            if(trimmed.charAt(i) == ' '){
                break;
            }
            len++;
        }
        return len;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
