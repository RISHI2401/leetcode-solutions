package Leetcodes;

import java.util.Scanner;

public class Leetcode_division_without_operator {
    public static int divide(int dividend, int divisor) {
        int actual_subtraction_count = 0;
        while(dividend >= divisor){
            dividend -= divisor;
            actual_subtraction_count += 1;
        }
        return actual_subtraction_count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        System.out.println(divide(dividend, divisor));
    }
}