package LeetCode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   7/30/14
 *
 * Given an array of integers,
 * every element appears twice except for one.
 * Find that single one.
 */

public class SingleNumber {
    public int singleNumber(int[] A) {
        int temp = 0;
        for (int i = 0; i < A.length; i++ ) {
            temp ^= A[i];
        }
        return temp;
    }

    @Test
    public void test() {
        assertEquals(1, singleNumber(new int[] {1,2,3,2,3}));
    }
}
