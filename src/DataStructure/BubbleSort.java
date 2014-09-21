package DataStructure;

import java.util.Arrays;
import java.util.Random;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   5/21/14
 *
 *
 * Data structure:                  Array
 * Worst case performance:	        O(n^2)
 * Best case performance:           O(n) typical
 * Average case performance:        O(n^2)
 * Worst case space complexity:	    O(1) auxiliary
 *
 */
public class BubbleSort {

/**This is generic implementation of Bubble Sort*/

    public static <T extends Comparable <? super T> > void bubbleSortGeneric(T[] array){

        int rightBound = array.length - 1;
        while (rightBound> 0) {
            int lastExchange = 0;
            for (int i = 0; i < rightBound; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    lastExchange = i;
                }
            }
            rightBound--;
        }
    }

    public static void main(String[] args) {

        // create test array and fill it with random values
        Integer[] array = new Integer[50];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = rnd.nextInt(100);

        // sort our array
        bubbleSortGeneric(array);

        // check if it really sorted now
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
