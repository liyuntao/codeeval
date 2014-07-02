package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liyuntao on 2014/6/25.
 */
public class FIND_A_WRITER {
    private static String writerInfo(String line) {
        String[] args = line.split("\\|");
        String[] num_str = args[1].trim().split("\\s+");
        char[] result = new char[num_str.length];
        for(int i = 0; i < num_str.length; i++) {
            result[i] = args[0].charAt(Integer.parseInt(num_str[i]) - 1);
        }
        return String.copyValueOf(result);
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(writerInfo(line));
        }
    }
}
