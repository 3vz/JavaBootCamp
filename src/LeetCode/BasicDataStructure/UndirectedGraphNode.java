package LeetCode.BasicDataStructure;
import java.util.List;
import java.util.ArrayList;
/**
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity :
 * Space Complexity:
 */

public class UndirectedGraphNode {
    public int label;
    public List<UndirectedGraphNode> neighbors;

    public UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }
}
