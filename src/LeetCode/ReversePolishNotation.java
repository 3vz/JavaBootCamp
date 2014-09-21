package LeetCode;

import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   9/7/14
 */

public class ReversePolishNotation {
    public int processRPN(String[] input) {
        int answer = 0;
        String operator = "+-*/%";
        Stack<Integer> stack =  new Stack<Integer>();
        for(String s: input) {
            if (!operator.contains(s))
                stack.push(Integer.valueOf(s));
            else {
                int index = operator.indexOf(s);
                int a = stack.pop();
                int b = stack.pop();
                switch (index) {
                    case 0: stack.push((a + b));break;
                    case 1: stack.push((b - a));break;
                    case 2: stack.push((a * b));break;
                    case 3: stack.push((b / a));break;
                    case 4: stack.push((b % a));break;
                }
            }
        }
        return stack.pop();
    }

    @Test
    public void test() {
        assertEquals( 4, processRPN(new String[]{"1", "2", "3", "+", "-"}));
    }
}
