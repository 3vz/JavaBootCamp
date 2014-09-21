package BasicSkill;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Given an array of integers,
 * every element appears twice except for one.
 * Find that single one.Note:Your algorithm should have a linear runtime complexity.
 * Could you implement it without using extra memory?
 *
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   7/15/14
 */

public class SingleNumber {
    public int singleNumber(int[] A) {
        int index = A[0];
        for (int i = 1; i < A.length; i++)
            index ^= A[i];
        return index;
    }

    @Test
    public void test() {
        assertEquals(1,this.singleNumber(new int[]{1, 2, 3, 4, 3, 4, 0, 0,2}));
    }

}
