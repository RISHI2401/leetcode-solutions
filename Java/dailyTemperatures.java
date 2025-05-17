package Leetcodes;

import java.util.Stack;

public class dailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures){
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i<temperatures.length; i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                result[index] = i-index;
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] temprature = {73,74,75,71,69,72,76,73};
        String s = "";
        int[] ans = dailyTemperatures(temprature);
        for(int i : ans){
            s += i;
        }
        System.out.println(s);
    }
}
