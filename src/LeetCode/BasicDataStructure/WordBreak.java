package LeetCode.BasicDataStructure;

import java.util.ArrayList;
import java.util.Set;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   9/12/14
 */

public class WordBreak {
    public boolean wordBreak(String s, Set<String> dict) {
        boolean[] t = new boolean[s.length()+1];
        t[0] = true; //set first to be true, why?
        //Because we need initial state

        for(int i=0; i<s.length(); i++){
            //should continue from match position
            if(!t[i])
                continue;

            for(String a: dict){
                int len = a.length();
                int end = i + len;
                if(end > s.length())
                    continue;

                if(t[end]) continue;

                if(s.substring(i, end).equals(a)){
                    t[end] = true;
                }
            }
        }
        return t[s.length()];
    }

    public ArrayList<String> wordBreak2(String s, Set<String> dict) {
        ArrayList<String> ret = new ArrayList<String>();
        if (s==null || s.length()==0) return ret;
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for (int i=1; i<=n; i++) {
            if (dict.contains(s.substring(0, i))) {
                dp[i] = true;
                continue;
            }
            for (int j=0; j<i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                }
            }
        }
        if (dp[n] == false) return ret; //DP的作用就这一行！！！
        StringBuilder cur = new StringBuilder();
        dfs(s, 0, cur, ret, dict);
        return ret;
    }

    public void dfs(String s, int start, StringBuilder cur, ArrayList<String> ret, Set<String> dict)  {
        int n = s.length();
        if (start >= n) {
            ret.add(new String(cur));
            return;
        }
        for (int i=start+1; i<=n; i++) {
            String sub = s.substring(start, i);
            if (dict.contains(sub)) {
                int oldLen = cur.length();
                if (oldLen!=0) cur.append(" ");
                cur.append(sub);
                dfs(s, i, cur, ret, dict);
                cur.delete(oldLen, cur.length());
            }
        }
    }
}
