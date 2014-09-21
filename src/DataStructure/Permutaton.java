package DataStructure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: zhaozhen1002
 * Date: 5/17/14
 */
public class Permutaton {

    public boolean checkPermutation(String dataOne, String dataTwo) {

        int[] charInOne= new int[256];
        char[] charArrayOne = dataOne.toCharArray();
        char[] charArrayTwo = dataTwo.toCharArray();

        if (dataOne.length() != dataTwo.length())
            return false;
        else {
            for (char c: charArrayOne) {
                charInOne[c]++;
            }
            for (char x: charArrayTwo ) {
                charInOne[x]--;
            }
        }

        for (int element : charInOne) {
            if (element != 0)
                return false;
        }

        return true;
    }

    @Test
    public void test() {
        assertEquals(true, checkPermutation("aabbcc", "abcabc"));
        assertEquals(false, checkPermutation("aabbcc", "abcedf"));
        assertEquals(true, checkPermutation("a b c ", "   abc"));
        assertEquals(false, checkPermutation("", "abcabc"));
    }
}
