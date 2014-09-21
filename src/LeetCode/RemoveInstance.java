package LeetCode;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   9/6/14
 */

public class RemoveInstance {
    private int remove(Comparable[] a, int target) {
        ArrayList newList = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            if (a[i].compareTo(target) != 0) {
                newList.add(a[i]);
            }
        }
        return newList.size();
    }

    @Test
    public void test() {
        Comparable[] sample = {1, 2, 3, 4, 5, 6,};
        assertEquals(5, remove(sample, 6));
    }
}
