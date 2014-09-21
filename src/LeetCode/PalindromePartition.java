package LeetCode;

import java.util.Arrays;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   9/11/14
 */

//1.pal[i][j] , which is whether s[i..j] forms a palindrome.
//2.d[i], which is the minCut for s[i..n-1] Once we comes to a pal[i][j]==true:
//if j==n-1, the string s[i..n-1] is a Pal, minCut is 0, d[i]=0;
//else: the current cut num (first cut s[i..j]
// and then cut the rest s[j+1...n-1]) is 1+d[j+1],
//compare it to the exisiting minCut num d[i], repalce if smaller.

public class PalindromePartition {
    public int minCut(String s) {
        if (s==null||s.length()==0) return 0;
        //Initiation
        int length=s.length();

        boolean[][] palindrome= new boolean[length][length];

        for (int i=0;i<length;i++)
            Arrays.fill(palindrome[i], false);

        int[] results = new int[length];
        //Start looping
        for (int start=length-1;start>=0;start--){
            results[start]=length-start-1;//Worst case:need length-start-i cuts
            for (int end=start;end<length;end++){
                if (s.charAt(start)==s.charAt(end)){
                    if (end-start<2)//Refer to these two cases: xx OR xyx
                        palindrome[start][end]=true;
                    else //Depends on the inner substring,if the inner substring is palindrome,the outer is
                        palindrome[start][end]=palindrome[start+1][end-1];
                }
                if (palindrome[start][end])
                    if (end==length-1)
                        results[start]=0;
                    else
                        results[start]=Math.min(results[start],results[end+1]+1);
            }
        }
        return results[0];
    }
}
