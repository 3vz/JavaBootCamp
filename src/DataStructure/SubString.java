package DataStructure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: zhaozhen1002
 * Date: 5/20/14
 */
public class SubString {
    public boolean checkSubString(String dataOne, String dataTwo) {
        if (dataOne.length() == dataTwo.length() && dataOne.length() > 0) {
            StringBuffer repeatData = new StringBuffer();
            repeatData.append(dataOne);
            repeatData.append(dataOne);
            for (int i = 0; i < dataOne.length(); i++) {
                if (repeatData.substring(i,i + dataTwo.length()).contentEquals(dataTwo))
                    return true;
            }
        }
        return false;
    }

    @Test
    public void test() {
        assertEquals(true, checkSubString("firebug", "bugfire"));
        assertEquals(false, checkSubString("firebug", "bf  ire"));
    }
}
