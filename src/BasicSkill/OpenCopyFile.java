package BasicSkill;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: Zhen Zhao
 * E-mail: zhen.zhao@nyu.edu
 * Date:   6/10/14
 */

public class OpenCopyFile {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<String>();
        File file = new File("/Users/zhaozhen1002/Desktop/sample.rtf");
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(file));
            String text;
            while ((text = reader.readLine()) != null) {
                list.add(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("IOEXCEPTION: " + e);
            }
        }

//print out the list
        System.out.println(list);
    }
}
