package Leetcodes;
import java.util.*;
public class ReversingWordsInAString {
    public static String reverseWords(String s) {
        //step 1 : trim the spaces
        String trimStr = s.trim();
        //step 2 : split the string with a space regex
        String[] splitStr = trimStr.split("\\s+"); // use \\s+ to match one or more spaces
        //step 3 : reversing the splited string
        String reversed = "";
        for(int i = splitStr.length - 1; i >= 0; i--){
            reversed += splitStr[i] + " ";
        }
        String ans = reversed.trim();
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverseWords(sc.nextLine())); // example   good a
    }

}
