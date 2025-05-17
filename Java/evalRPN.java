package Leetcodes;

import java.util.Stack;

public class evalRPN {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int operant2 = stack.pop();
                int operant1 = stack.pop();

                switch (token) {
                    case "+":
                        stack.push(operant1 + operant2);
                        break;
                    case "-":
                        stack.push(operant1 - operant2);
                        break;
                    case "*":
                        stack.push(operant1 * operant2);
                        break;
                    case "/":
                        if (operant2 == 0) {
                            break;
                        }
                        stack.push(operant1 / operant2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    private static boolean isNumeric(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == 0 && c == '-' && s.length() > 1) {
                continue; // Skip the negative sign at the beginning
            }
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] tokens = {"4", "3", "-"};
        System.out.println(evalRPN(tokens));
    }
}
/*

Example 1:

Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9

Example 2:

Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6

Example 3:

Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
Output: 22
Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22

 */

/*
    // PYTHON CODE

def evalRPN(self, tokens: List[str]) -> int:
    stack = []
    for token in tokens:
        if(self.isNumeric(token)):
            stack.append(int(token))
        else:
            operand2 = stack.pop()
            operand1 = stack.pop()

            if token == "+":
                stack.append(operand1 + operand2)
            elif token == "-":
                stack.append(operand1 - operand2)
            elif token == "*":
                stack.append(operand1 * operand2)
            elif token == "/":
                if operand2 == 0:
                    break
                stack.append(int(operand1 / operand2))
    return stack.pop()

def isNumeric(self, s: str) -> bool:
    if not s:
        return False
    for i, c in enumerate(s):
        if i == 0 and c == "-" and len(s) > 1:
            continue
        if not c.isdigit():
            return False
    return True

 */
