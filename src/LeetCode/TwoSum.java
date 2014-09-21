package LeetCode;

import java.util.*;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   9/12/14
 */

public class TwoSum {

    // two sum: Given an array of integers, find two numbers such that they add up to a specific target number.
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (hashMap.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = hashMap.get(target - numbers[i]);
                return result;
            }
            hashMap.put(numbers[i], i + 1);
        }
        return result;
    }

    // four sum
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if (num == null || num.length < 4) return ret;

        ArrayList<Two> pairs = new ArrayList<Two>();
        int n = num.length;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                Two curPair = new Two(i, j, num[i] + num[j]);
                pairs.add(curPair);
            }
        }

        Collections.sort(pairs, new Comparator<Two>() {
            public int compare(Two i, Two j) {
                return i.sum - j.sum;
            }
        });

        HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
        int m = pairs.size();
        int p = 0, q = m - 1;
        while (p < q) {
            int sum4 = pairs.get(p).sum + pairs.get(q).sum;
            if (sum4 > target) {
                q--;
            } else if (sum4 < target) {
                p++;
            } else {
                int leftStart = p, rightEnd = q;
                int leftEnd = p, rightStart = q;
                if (pairs.get(p).sum == pairs.get(q).sum) {
                    leftEnd = q;
                    rightStart = p;
                } else {
                    while (pairs.get(leftEnd + 1).sum == pairs.get(leftEnd).sum) {
                        leftEnd++;
                    }
                    while (pairs.get(rightStart - 1).sum == pairs.get(rightStart).sum) {
                        rightStart--;
                    }
                }

                for (int i = leftStart; i <= leftEnd; i++) {
                    for (int j = rightStart; j <= rightEnd; j++) {
                        if (!pairs.get(i).goodWith(pairs.get(j))) {
                            continue;
                        }
                        ArrayList<Integer> list4 = new ArrayList<Integer>();
                        list4.add(num[pairs.get(i).index1]);
                        list4.add(num[pairs.get(i).index2]);
                        list4.add(num[pairs.get(j).index1]);
                        list4.add(num[pairs.get(j).index2]);
                        Collections.sort(list4);
                        if (!set.contains(list4)) {
                            ret.add(list4);
                            set.add(list4);
                        }
                    }
                }
                p = leftEnd + 1;
                q = rightStart - 1;
            }
        }
        return ret;
    }

    class Two {
        int index1;
        int index2;
        int sum;

        Two(int index1, int index2, int sum) {
            this.index1 = index1;
            this.index2 = index2;
            this.sum = sum;
        }

        boolean goodWith(Two two) {
            return (index1 != two.index1 && index1 != two.index2
                    && index2 != two.index1 && index2 != two.index2);
        }
    }
}
