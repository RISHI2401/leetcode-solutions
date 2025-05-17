package Leetcodes;

import java.util.ArrayList;
import java.util.List;

public class plusOne {
    public static int[] plusOne(int[] digits){
       for(int i = digits.length - 1; i>=0; i--){
           if (digits[i] < 9){
               digits[i]++;
               return digits;
           }
           digits[i] = 0; //carry over
       }
       // if all digits are nine then we need an extra digit at the front
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {1,2,3};
        int[] answer = plusOne(digits);
        System.out.print(answer);
    }
}
