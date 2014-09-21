package LeetCode;

/**
 * There are N children standing in a line.
 * Each child is assigned a rating value.
 * You are giving candies to these children:
 * 1.Each child must have at least one candy.
 * 2.Children with a higher rating get more candies than their neighbors.
 * What is the minimum candies you must give?
 *
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

public class Candy {
    public int solution(int[] ratings) {
        int[] candy = new int[ratings.length];
        candy[0] = 1;
        for (int i = 1; i < ratings.length; i++) {
            candy[i] = ratings[i] > ratings[i-1]? candy[i-1]+1: 1;
        }

        for (int i = ratings.length-2; i >= 0; i--) {
            candy[i] = ratings[i] > ratings[i + 1] && candy[i+1] + 1 > candy[i]?candy[i+1]+1: candy[i];
        }
        int total = 0;
        for (int  i = 0; i < candy.length; i++) total +=candy[i];
        return total;
    }
}

