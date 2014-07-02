package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liyuntao on 2014/6/23.
 */
public class FIBONACCI_SERIES {
    private static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        if(n < 2) return n;
        for(int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(fibonacci(Integer.parseInt(line)));
        }
    }
}
