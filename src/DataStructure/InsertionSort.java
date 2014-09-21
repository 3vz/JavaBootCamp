package DataStructure;

import java.util.Arrays;
import java.util.Random;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   5/25/14
 *
 *
 * Data structure:                  Array
 * Worst case performance:          O(n^2) comparisons, swap
 * Best case performance:           O(n) comparision, O(1) swap
 * Average case performance:        O(n^2) comparisons, swap
 * Worst case space complexity:     О(n) total, O(1) auxiliary
 */

public class InsertionSort {

    public static <T extends Comparable <? super T> > void insertionSort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            T temp = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (array[j].compareTo(temp) > 0)
                    array[j + 1] = array[j];
                else break;
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args)
    {
        // create test array and fill it with random values
        Integer[] array = new Integer[50];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = rnd.nextInt(100);

        System.out.println("array before sorted: " + Arrays.toString(array));

        insertionSort(array);

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
