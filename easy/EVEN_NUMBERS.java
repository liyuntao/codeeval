package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liyuntao on 2014/6/25.
 */
public class EVEN_NUMBERS {
    private static int isEven(String line) {
        int n = Integer.parseInt(line);
        return (n % 2 == 0) ? 1 : 0;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(isEven(line));
        }
    }
}
