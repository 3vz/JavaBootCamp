package DataStructure;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by zhaozhen1002 on 5/27/14.
 */
public class BinarySearch {
    static <T extends Comparable<? super T>> int binarySearch(T value, List<T> values) {

        int n = values.size();
        int mid, left, right;
        T midVal;
        left = 0;
        right = n - 1;

        do {
            mid = left+(right-left)>>1;
            midVal = values.get(mid);
            if (value.compareTo(values.get(mid)) < 0)
                right = mid - 1;
            else if (value.compareTo(values.get(mid)) > 0)
                left = mid + 1;
            else
                return mid;
        }
        while (left <= right);
        return (value.compareTo(midVal) < 0) ? -mid : -(mid + 1);
    }


    @Test
    public void integerSorting() {
        assertEquals(2, BinarySearch.binarySearch(4, Arrays.asList(1, 3, 4, 7 , 9, 22)));
    }

}
