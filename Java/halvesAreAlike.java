package Leetcodes;

import java.util.HashSet;
import java.util.Set;

public class halvesAreAlike {
    public static boolean halvesAreAlike(String s){
        int mid = s.length()/2;
        String a = s.substring(0, mid);
        String b = s.substring(mid);

        return vowelCount(a) == vowelCount(b);
    }
    private static int vowelCount(String s){

        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');

        int count = 0;
        for(Character c : s.toCharArray()){
            if(vowels.contains(c)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("textbook"));
    }
}
