package LeetCode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   7/30/14
 */

public class ReverseInteger {
    public static int reverse(int x) {
        int negative = 1;
        int result;
        result = 0;
        if (x < 0) {
            negative = -1;
            x = -x;
        }
        while (x / 10 > 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        result = result * 10 + x;
        return result * negative;
    }


    @Test
    public void sample() {
        assertEquals(123, reverse(321));
        assertEquals(-123, reverse(-321));
    }

}
