package LeetCode;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   9/7/14
 */

public class ReverseString {
    public String reverseString(String sent) {
        String[] words = sent.trim().split("\\s+");
        StringBuilder output = new StringBuilder();
        if (words.length > 0) {
            for (int i = words.length - 1; i > 0; i--) {
                output.append(words[i]);
                output.append(" ");
            }
            output.append(words[0]);
        }
        return output.toString();
    }
}
