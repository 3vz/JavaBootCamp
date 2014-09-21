package LeetCode;

/**
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity :
 * Space Complexity:
 */

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] headList = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            headList[i] = matrix[i][0];
        }
        int row = searchInsert(headList, target);
        if (row < 1 ) return false;
        System.out.println(row);

        int[] processingList = matrix[row-1];
        return binarySearch(processingList, target);
    }

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
        System.out.println(index);
        return index;


    }

    public static boolean binarySearch(int[] A, int target) {
        int left = 0, right = A.length-1, mid =0;
        while(left < right) {
            mid = left + (right - left)>>1;
            if (target < A[mid]) right = mid - 1;
            else if (target > A[mid]) left = mid + 1;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Search2DMatrix test = new Search2DMatrix();
        int[][] sample = {{1}};
        System.out.print(test.searchMatrix(sample, 2));
    }
}
