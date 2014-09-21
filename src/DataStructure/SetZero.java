package DataStructure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: zhaozhen1002
 * Date: 5/20/14
 */
public class SetZero {
    public int[][] settingZero (int[][] data) {
        boolean[] row = new boolean[data.length];
        boolean[] column = new boolean[data[0].length];

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] == 0) {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (row[i] || column[j]) {
                    data[i][j] = 0;
                }

            }
        }
        return data;
    }

    @Test
    public void test() {

        int[][] data = {{1,1,1},
                        {2,0,2},
                        {3,3,3}};

        int[][] result = {{1,0,1},
                          {0,0,0},
                          {3,0,3}};
        assertEquals(result, settingZero(data));
    }

}
