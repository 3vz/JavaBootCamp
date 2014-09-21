package DataStructure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: zhaozhen1002
 * Date: 5/15/14
 */
public class StringReverse {
    public String reverse(String data) {
        char[] dataArray = data.toCharArray();
        char swap;
        for (int i =0; i < dataArray.length/2 + 1; i++) {
            swap = dataArray[i];
            dataArray[i] = dataArray[dataArray.length - i - 1];
            dataArray[dataArray.length - i - 1] = swap;
        }
        return new String(dataArray);
    }

    @Test
    public void test () {
        assertEquals("abc", reverse("cba"));
        assertEquals("abc", reverse("ccba"));
        assertEquals("abc ", reverse("cba"));
    }
}
