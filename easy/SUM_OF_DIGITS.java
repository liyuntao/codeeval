package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liyuntao on 2014/6/23.
 */
public class SUM_OF_DIGITS {

    private static int sumOfDigit(String s) {
        int n = Integer.parseInt(s);
        int result = 0;
        while(n != 0) {
            result += n % 10;
            n = n / 10;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(sumOfDigit(line));
        }
    }
}
