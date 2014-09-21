package BasicSkill;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   6/11/14
 *
 * Given an array of integers,
 * every element appears three times except for one.
 * Find that single one.
 */

public class LogicOperator {

    int singleNumber(int A[]) {
        int ones = 0, twos = 0, threes;
        for (int i = 0; i < A.length; i++) {
            twos |= ones & A[i];
            ones ^= A[i];
            threes = ones & twos;
            ones &= ~threes;
            twos &= ~threes;
            System.out.println("Step " + i + ": ");
            System.out.print("ones: " + ones + "   ");
            System.out.print("twos: " + twos + "   ");
            System.out.print("threes: " + threes + "   ");
            System.out.println("\n");
        }
        return ones;
    }

    public static void main(String[] args) {

        LogicOperator test = new LogicOperator();
        int[] arry = {1, 2, 3, 2, 2, 3, 3};
        test.singleNumber(arry);
//        int x = 0;
//        int y = 2;
//        int z;
//
//        z = x&y;
//        System.out.println("0 & 2 : " + z);
//
//        z = y|x;
//        System.out.println("0 | 2 : " + z);
//
//        z = y^x;
//        System.out.println("2 ^ 0: " + z);
//
//        z = x&~y;
//        System.out.println("0 &~ 2 : " + z);


    }
}
