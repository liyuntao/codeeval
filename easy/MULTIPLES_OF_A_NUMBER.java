package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liyuntao on 2014/6/25.
 */
public class MULTIPLES_OF_A_NUMBER {
    private static int multiples(String line) {
        String[] num_strs = line.split(",");
        int m = Integer.parseInt(num_strs[0]);
        int n = Integer.parseInt(num_strs[1]);
        int i = 1;
        while(m > n * i) {
            i++;
        }
        return n * i;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(multiples(line));
        }
    }
}
