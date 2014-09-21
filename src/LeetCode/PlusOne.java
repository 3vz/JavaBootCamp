package LeetCode;

/**
 * Given a non-negative number represented as an array of digits,
 * plus one to the number.
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 * E-mail: zhen.zhao@nyu.edu
 * Time Complexity :
 * Space Complexity:
 */

public class PlusOne {
    public int[] plusOne(int[] digits){
        if (digits == null || digits.length == 0) return digits;
        int carry = 1, digit = 0;
        for (int i = digits.length-1; i >=0; i--) {
            digit +=  (digits[i] + carry)%10;
            carry = (digits[i] + carry)/10;
            digits[i] =  digit;
            if (carry == 0) return digits;
        }
        int [] res = new int[digits.length+1];
        res[0] = 1;
        return res;
    }
}
