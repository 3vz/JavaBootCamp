package LeetCode;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   7/31/14
 */

public class InsertPosition {

    /**
     * This class should not be instantiated
     */
    public InsertPosition(){}
    /**
     * Define a method which can find the position to insert a number
     * which is improved from Binary Search.
     */
    public static int searchInsert(int[] A, int target) {
        int index = 0;
        if ( target <= A[0] )
            index = 0;
        else if (target > A[A.length-1])
            index = A.length;
        else {
            for (int  i = 0; i < A.length; i++) {
                if (target == A[i])
                    index = i ;
                else if (target > A[i] && target <= A[i+1])
                    index = i + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] sample = {1,2,5,8,11};
        System.out.println(searchInsert(sample, 7));
    }
}
