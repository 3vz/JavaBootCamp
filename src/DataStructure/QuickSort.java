package DataStructure;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   5/27/14
 *
 *
 * Data structure:                  Array
 * Worst case performance:	        O(n^2)
 * Best case performance:           O(n log n)
 * Average case performance:        O(n log n)
 * Worst case space complexity:	    O(n) auxiliary
 *
 */

public class QuickSort {
    static <T extends Comparable<? super T>> void quicksort(T[] array) {
        quicksort(array, 0, array.length - 1);
    }

    static <T extends Comparable<? super T>> void quicksort(T[] array, int left0, int right0) {

        int left = left0;
        int right = right0 + 1;
        T pivot, temp;

        pivot = array[left0];

        do {

            do left++; while (left <= right0 && array[left].compareTo(pivot) < 0);

            do right--; while (array[right].compareTo(pivot) > 0);

            if (left < right) {
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;
            }
        }
        while (left <= right);

        temp = array[left0];
        array[left0] = array[right];
        array[right] = temp;

        if (left0 < right) quicksort(array, left0, right);
        if (left < right0) quicksort(array, left, right0);
    }

    @Test
    public void integerSorting() {

        Integer[] array = { 5, 3, 4, 2, 1 };
        quicksort(array);
        Integer[] correct = { 1, 2, 3, 4, 5 };
        assertArrayEquals(correct, array);

    }

    @Test
    public void floatSorting() {
        Float[] array = { 1.8F, 3.6F, 4F, 5F, 2F };
        quicksort(array);
        Float[] correct = { 1.8F, 2F, 3.6F, 4F, 5F };
        assertArrayEquals(correct, array);
    }

    @Test
    public void stringSorting() {
        String[] array = {"Batman", "Spiderman", "Anthony", "Zoolander"};
        quicksort(array);
        String[] correct = {"Anthony", "Batman",  "Spiderman",  "Zoolander"};
        assertArrayEquals(correct, array);
    }
}
