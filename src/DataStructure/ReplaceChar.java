package DataStructure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: zhaozhen1002
 * Date: 5/17/14
 */
public class ReplaceChar {
    public String replaceChar(String data) {

        char[] dataArray = data.toCharArray();
        int count = 0;
        int overLen = 0;

        for (char c: dataArray) {
            if (c == ' ')
                count++;
        }

        char[] temp;
        temp = new char[dataArray.length + count * 2];

        for (int i = 0; i < dataArray.length; i++) {
            if (dataArray[i] != ' ')
                temp[i + overLen] = dataArray[i];
            else {
                temp[i + overLen] = '%';
                temp[i + overLen + 1] = '2';
                temp[i + overLen + 2] = '0';
                overLen = overLen + 2;
            }
        }

        return new String(temp);
    }

    @Test
    public void test() {
        assertEquals("ad%20c", replaceChar("ad c"));
    }
}
