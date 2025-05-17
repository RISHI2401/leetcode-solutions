package Leetcodes;

import Learning.CharacterStreamExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class isValid {
    public static boolean isValid(String s){
        // let's do it using a map and a stack
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();

        for(int i=0; i<c.length; i++){

            if(map.containsKey(c[i])){
                stack.push(c[i]);

            }else {
                if(stack.isEmpty() || map.get(stack.pop()) != c[i]){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(()}";
        System.out.println(isValid(s));
    }
}

