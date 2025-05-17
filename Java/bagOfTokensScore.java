package Leetcodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bagOfTokensScore {
    public static int bagOfTokensScore(int[] tokens, int power){
        int len = tokens.length;
        if (len == 0) return 0;
        if (len == 1) {
            if (tokens[0] > power) return 0;
            return 1;
        }

        Arrays.sort(tokens);
        int score = 0;
        int leftPointer = 0;
        int rightPointer = len - 1;
        int low = tokens[leftPointer];
        int high = tokens[rightPointer];

        while (low <= high) {
            if (power >= low) {
                score++;
                power -= low;
                leftPointer++;
            } else if (score > 0 && high > low) {
                score--;
                power += high;
                rightPointer--;
            } else {
                break;
            }

            // Update low and high inside the loop
            low = tokens[leftPointer];
            high = tokens[rightPointer];
        }

        return score;
    }

    public static void main(String[] args) {
        int[] tokens = {100,200,300,400};
        int power = 200;
        System.out.println(bagOfTokensScore(tokens, power));
    }
}
