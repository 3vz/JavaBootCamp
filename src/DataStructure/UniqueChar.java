package DataStructure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: zhaozhen1002
 * Date: 5/14/14
 */
public class UniqueChar {

    public boolean checkStatus (String data) {

        boolean[] charStatus = new boolean[256];

        for (int i = 0; i < data.length(); i++ ) {
            int index;
            index = data.charAt(i);
            if(charStatus[index]) {
                return false;
            }
            else
                charStatus[index] = true;
        }
        return true;
    }


    @Test
    public void Test() {
        assertEquals(true, checkStatus("abcd"));
        assertEquals(false, checkStatus("aabdccdd"));
        assertEquals(true, checkStatus(" acd"));
        assertEquals(true, checkStatus(""));
    }
}
