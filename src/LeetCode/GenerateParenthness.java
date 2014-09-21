package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given n pairs of parentheses,
 * write a function to generate all combinations of well-formed parentheses.
 *
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity :
 * Space Complexity:
 */

public class GenerateParenthness {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<String>();
        String item = new String();

        if (n<=0)
            return res;

        dfs(res,item,n,n);
        return res;
    }

    public void dfs(ArrayList<String> res, String item, int left, int right){
        if(left > right)//deal wiith ")("
            return;

        if (left == 0 && right == 0){
            res.add(new String(item));
            return;
        }

        if (left>0)
            dfs(res,item+'(',left-1,right);
        if (right>0)
            dfs(res,item+')',left,right-1);
    }


    // no recursive way
    public List<String> generate(int n) {
        ArrayList<String> list = new ArrayList<String>();
        Stack<String> stack = new Stack<String>();
        Stack<Integer> validationStack = new Stack<Integer>();
        stack.push("(");
        validationStack.push(0);
        while(stack.size() != 0)
        {
            String s = stack.pop();
            int v = validationStack.pop();

            //check if we already enough parenthsis
            if(s.length() == n * 2)
            {
                list.add(s);
                continue;
            }

            // check if we already have enough "(", if s.length() - v > n,
            // means we have too many  start parenthesis and we do not have enough close parenthesis to close it.
            if(s.length() - v < n)
            {
                stack.push(s + "(");
                validationStack.push(v);
            }
            // check if we already have to many")", if 2*v > s.length, means we have too many close parenthesis
            if(2 * v < s.length())
            {
                stack.push(s + ")");
                validationStack.push(v+1);
            }
        }
        return list;
    }
}
