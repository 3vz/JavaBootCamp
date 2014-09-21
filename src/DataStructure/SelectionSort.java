package DataStructure;

import java.util.Arrays;
import java.util.Random;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   5/23/14
 *
 *
 * Data structure:                  Array
 * Worst case performance:	        O(n^2)
 * Best case performance:           O(n^2) typical
 * Average case performance:        O(n^2)
 * Worst case space complexity:	    О(n) total, O(1) auxiliary
 *
 */

public class SelectionSort {

    public static <T extends Comparable <? super T> > void selectionSort(T[] array) {
        int leftBound = 0;
        T temp;

        while (leftBound < array.length) {
            for (int i = leftBound + 1; i < array.length; i++) {
                if (array[leftBound].compareTo(array[i]) > 0) {
                    temp = array[leftBound];
                    array[leftBound] = array[i];
                    array[i] = (T) temp;
                }
            }
            leftBound++;
        }
    }

    public static void main(String[] args)
    {
        // create test array and fill it with random values
        Integer[] array = new Integer[50];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = rnd.nextInt(100);

        System.out.println("array sorted: " + Arrays.toString(array));
        selectionSort(array);

        // check if it is really sorted now
        for (int i = 0; i < array.length - 1; i++ )
        {
            if (array[i] > array[i + 1])
            {
                System.out.println("something wrong");
                return;
            }
        }

        System.out.println("array sorted: " + Arrays.toString(array));
    }

}
