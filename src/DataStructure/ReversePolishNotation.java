package DataStructure;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhaozhen1002 on 5/28/14.
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * Some examples:
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class ReversePolishNotation {
    static int processRPN(String[] data) {
        String operators = "+-*/";
        int result = 0;
        Stack<String> stack = new Stack<String>();

        for (String t: data) {
            if (!operators.contains(t)) {
                stack.push(t);
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());
                if (t.equals("+")) {
                    stack.push(String.valueOf(a + b));

                } else if (t.equals("-")) {
                    stack.push(String.valueOf(b - a));

                } else if (t.equals("*")) {
                    stack.push(String.valueOf(b * a));

                } else if (t.equals("/")) {
                    stack.push(String.valueOf(b / a));

                }
            }
        }
        return result = Integer.valueOf(stack.pop());
    }

    @Test
    public  void test() {
        assertEquals(1, processRPN(new String[]{"1", "2", "*", "1", "-"}));
    }


}
