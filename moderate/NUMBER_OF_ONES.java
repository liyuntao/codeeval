package codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liyuntao on 2014/6/26.
 */
public class NUMBER_OF_ONES {
    private static int count(String line) {
        int n = Integer.parseInt(line);
        int count = 0;
        while(n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(count(line));
        }
    }

}
