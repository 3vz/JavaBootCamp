package LeetCode;
import java.util.ArrayList;
import java.util.List;
/**
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity : O(N^2)
 * Space Complexity:
 */

public class GrayCode {
    public List<Integer> generate(int n) {
        List<Integer> gcList = new ArrayList<Integer>();
        gcList.add(0);
        for (int i = 0; i < n; i++) {
            int element = 1<<i;
            for (int j = gcList.size()-1; j >= 0 ; j-- ) {
                gcList.add(gcList.get(j) + element);
            }
        }
        return gcList;

    }

    public static void main(String[] args) {
        GrayCode test = new GrayCode();
        System.out.println(test.generate(2));
        System.out.println(test.generate(3));
    }
}
