package LeetCode;

/**
 * There are N gas stations along a circular route,
 * where the amount of gas at station i is gas[i].
 * You have a car with an unlimited gas tank and
 * it costs cost[i] of gas to travel from station i to its next station (i+1).
 * You begin the journey with an empty tank at one of the gas stations.
 * Return the starting gas station's index if you can travel around the circuit once,
 * otherwise return -1.
 * The solution is guaranteed to be unique.
 *
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity : O(N)
 * Space Complexity:
 */

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int[] diff = new int[n];
        int sum = 0, gasLeft = 0, startNode = 0;
        for (int i = 0; i < n; i++) {
            diff[i] += gas[i] - cost[i];
            sum += diff[i];
            gasLeft += diff[i];
            if (sum < 0) {startNode = i + 1; sum =0;}
        }
        if (gasLeft < 0 ) return -1;
        else return startNode;
    }
}
