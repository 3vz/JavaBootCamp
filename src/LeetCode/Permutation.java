package LeetCode;

import java.util.ArrayList;
import java.util.List;
/**
 * Given a collection of numbers, return all possible permutations.
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity :
 * Space Complexity:
 */

public class Permutation {
    public List<List<Integer>> permute(int[] num) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(num.length == 0) return ans;
        List<Integer> instance = new ArrayList<Integer>();
        boolean[] visited = new boolean[num.length];
        permutation(ans, instance, visited, num );
        return ans;
    }

    public void permutation(List<List<Integer>> ans, List<Integer> instance, boolean[] visited, int[] num ) {
        if (instance.size() == num.length) {
            ans.add(new ArrayList<Integer>(instance));
            return;
        }
        else {
            for (int i = 0; i < num.length; i++) {
                if (!visited[i]) {
                    instance.add(num[i]);
                    visited[i] = true;
                    permutation(ans, instance, visited, num);
                    visited[i] = false;
                    instance.remove(instance.size()-1);
                }
            }
        }
    }

}
