package LeetCode;

/**
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity :
 * Space Complexity:
 */

public class ContainMostWater {
    public int maxArea(int[] height) {
        int len = height.length, low = 0, high = len -1 ;
        int maxArea = 0;
        while (low < high) {
            maxArea = Math.max(maxArea, (high - low) * Math.min(height[low], height[high]));
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        ContainMostWater test = new ContainMostWater();
        int[] sample = {2,5,1,2,3,4,7,7,6};
        System.out.print(test.maxArea(sample));
    }
}
