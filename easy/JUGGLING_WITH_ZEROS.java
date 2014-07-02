package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liyuntao on 2014/6/23.
 */
public class JUGGLING_WITH_ZEROS {
    private static long transform(String line) {
        String[] zeros = line.split("\\s+");
        String result = "0";
        boolean hasOne = false;
        for(int i=0; i < zeros.length; i+=2) {
            if("0".equals(zeros[i])) {
                if(!hasOne) continue;
                result += zeros[i+1];

            } else if ("00".equals(zeros[i])) {
                hasOne = true;
                result += zeros[i+1].replace('0', '1');
            }
        }
        return Long.parseLong(result, 2);
    }


    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(transform(line));
        }
    }
}
