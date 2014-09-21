package LeetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 *
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity :
 * Space Complexity:
 */

public class PasCalTriangle {
    public List<List<Integer>> generate(int numRows) {
        // Init triangle
        List<List<Integer>> triangle  =  new ArrayList<List<Integer>>();
        if (numRows==0) return triangle;
        List<Integer> levelZero = Arrays.asList(1);
        List<Integer> levelOne = Arrays.asList(1,1);
        triangle.add(levelZero);
        if (numRows ==1) return triangle;
        triangle.add(levelOne);
        if (numRows == 2) return triangle;

        for(int i = 2; i < numRows; i++) {
            List<Integer> level = new ArrayList<Integer>();
            level.add(1);
            for(int j = 1; j < i; j++) {
                level.add(j, triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
            }
            level.add(1);
            triangle.add(level);
        }
        return triangle;
    }

    public static void main(String[] args) {
        PasCalTriangle test = new PasCalTriangle();
        System.out.println(test.generate(5));
    }
 }
