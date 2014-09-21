package Codility;

import org.junit.Test;

import java.util.Map;
import java.util.HashMap;
import java.util.Collections;
import static junit.framework.TestCase.assertEquals;

/**
 *calculate the difference of an array's two continues parts.
 *
 */

public class TapeEquilibr {
    public int solution(int[] A) {
        if (A.length == 1) return A[0];
        int total = 0, tempTotal = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int a : A) {
            total += a;
        }
        for (int j = 1 ; j < A.length - 1; j++) {
            tempTotal += A[j];
            map.put(j, Math.abs(2*tempTotal - total));
        }
        return Collections.min(map.values());
    }

    @Test
    public void test() {
        TapeEquilibr test = new TapeEquilibr();
        int[] data1 = {0,0,0,0,0};
        int[] data2 = {0,0,0,0,1};
        int[] data3 = {1,0,0,0,0};
        int[] data4 = {0};
        assertEquals(0, test.solution(data1));
        assertEquals(1, test.solution(data2));
        assertEquals(1, test.solution(data3));
        assertEquals(0, test.solution(data4));
    }
}

