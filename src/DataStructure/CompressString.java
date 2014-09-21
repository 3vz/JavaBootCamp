package DataStructure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: zhaozhen1002
 * Date: 5/19/14
 */
public class CompressString {

    public String compressing(String data) {
        StringBuilder result = new StringBuilder();
        char last = data.charAt(0);
        int count = 1;
        for (int i = 1; i < data.length(); i++) {
            if (data.charAt(i) == last) {
                count++;
            }
            else {
                result.append(last);
                result.append(count);
                last = data.charAt(i);
                count = 1;
            }
        }
        result.append(last);
        result.append(count);

        if(data.length() > result.length())
            return result.toString();
        else
            return data;
    }

    @Test
    public void test() {
        assertEquals("a3b3c3", compressing("aaabbbccc"));
        assertEquals("abc", compressing("abc"));
    }
}
