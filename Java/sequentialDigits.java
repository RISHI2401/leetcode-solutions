package Leetcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sequentialDigits {
    public static List<Integer> sequentialDigits(int low, int high){
        List<Integer> result = new ArrayList<>();

        for(int i = 1; i <= 9; i++){

            int num = i;
            int nextDigit = i+1;

            while(num <= high && nextDigit <= 9){
                num = num * 10 + nextDigit;

                if(low <= num && num <= high){
                    result.add(num);
                }
                nextDigit++;
            }
        }
        result.sort(null);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = sequentialDigits(100,300);
        for(int i : list){
            System.out.print(i + ", ");
        }
    }
}
