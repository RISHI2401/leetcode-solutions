package Leetcodes;
import java.util.*;
import java.util.Scanner;

public class HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> seenSums = new HashSet<>();
        int num = n;

        while (num != 1 && !seenSums.contains(num)) {
            seenSums.add(num);
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += digit * digit;
                num /= 10;
            }

            num = sum;
        }

        return num == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isHappy(sc.nextInt()));
    }
}
