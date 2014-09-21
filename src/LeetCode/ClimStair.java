package LeetCode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   8/17/14
 */


//O()
public class ClimStair {
    public int climbing(int n) {
        int[] result = new int[n+1];
        result[0] = 1;
        result[1] = 1;
        if (n < 2)
            return 1;
        else {
            for (int i = 2; i < n + 1; i++)
                result[i] = result[i - 1] + result[i - 2];
            return result[n];
        }
    }

    @Test
    public void test() {
        assertEquals(2, climbing(2));
        assertEquals(3, climbing(3));
        assertEquals(5, climbing(4));
    }
}
