package DataStructure;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   6/15/14
 * You are given two 32-bit numbers,N andM,
 * and two bit positions, i and j.
 */

public class FivePointOne {
    public static long insertNumber(int i, int j) {
        if (j < i)
        {
            i = i + j;
            j = i - j;
            i = i - j;
        }
        return i;
    }

    public static void main (String[] args) {
        insertNumber(3, 2);
    }
}
