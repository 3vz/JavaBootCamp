package BasicSkill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   6/9/14
 */

public class ReadInAndOut {
    public static void main(String[] args) throws IOException {

        //system.in.read
        int b = 0;
        try {
            b = System.in.read();
        } catch (Exception e) {
            System.out.println("Caught" + e);
        }
        System.out.println("1.Read this data " + (char)b);

        //scanner read
        try {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            System.out.println("2.Read this data " + i);
        } catch (InputMismatchException ed) {
            System.out.println("Hey you should input an INT");
        }


//        //BufferedReader
//        try {
//            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//            String inputLine;
//            while ((inputLine = bf.readLine()) != null) {
//                System.out.println("3.Read this data " + inputLine);
//            }
//        } catch (IOException e) {
//            System.out.println("IOException" + e);
//        }

        String line = null;
        int val = 0;
        try {
            BufferedReader stm = new BufferedReader(new InputStreamReader(System.in));
            line = stm.readLine();
            val = Integer.parseInt(line);
            System.out.println("3.Read this data " + val);
        } catch (NumberFormatException ne) {
            System.err.println("Not a valid number: " + line);
        } catch (IOException e) {
            System.err.println("IOException " + e);
        }
    }
}
