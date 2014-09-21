package LeetCode;

import org.junit.Test;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   8/21/14
 */

public class MaximumSubarray {
    public int max(int[] input) {
        int maxSoFar = input[0];
        int maxEnding = input[0];

        for (int i = 1; i < input.length; i++) {
            if (maxEnding < 0)
                maxEnding = input[i];
            else
                maxEnding += input[i];
            if (maxEnding >= maxSoFar)
                maxSoFar = maxEnding;
        }
        return maxSoFar;
    }

    @Test
    public void test(){

    }
}
