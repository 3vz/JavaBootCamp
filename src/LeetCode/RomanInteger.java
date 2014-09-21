package LeetCode;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   8/17/14
 */

public class RomanInteger {
    public int romanToInteger(String romanNumber) {
        int previousNumber = 0;
        int decimcalResult= 0;
        String upperRomanNumber = romanNumber.toUpperCase();
        char[] charRomanNumber = upperRomanNumber.toCharArray();
        int size = charRomanNumber.length;
        for(int i = size -1 ; i >= 0 ; i--) {
            switch (charRomanNumber[i]) {
                case 'M' :
                    decimcalResult  = demicalProcess(1000, previousNumber, decimcalResult);
                    previousNumber = 1000;
                    break;
                case 'D' :
                    decimcalResult  = demicalProcess(500, previousNumber, decimcalResult);
                    previousNumber = 500;
                    break;
                case 'C' :
                    decimcalResult  = demicalProcess(100, previousNumber, decimcalResult);
                    previousNumber = 100;
                    break;
                case 'L' :
                    decimcalResult  = demicalProcess(50, previousNumber, decimcalResult);
                    previousNumber = 50;
                    break;
                case 'X' :
                    decimcalResult  = demicalProcess(10, previousNumber, decimcalResult);
                    previousNumber = 10;
                    break;
                case 'V' :
                    decimcalResult  = demicalProcess(5, previousNumber, decimcalResult);
                    previousNumber = 5;
                    break;
                case 'I' :
                    decimcalResult  = demicalProcess(1, previousNumber, decimcalResult);
                    previousNumber = 1;
                    break;
            }
            System.out.println(decimcalResult);
        }
        return decimcalResult;
    }

    private int demicalProcess(int decimal, int previousNumber, int decimcalResult) {
        if (previousNumber > decimal)
            return decimcalResult - decimal;
        else
            return decimcalResult + decimal;
    }

    public static void main(String[] args) {
        RomanInteger test = new RomanInteger();
        String data = "dcxxi";
        test.romanToInteger(data);
    }
}
