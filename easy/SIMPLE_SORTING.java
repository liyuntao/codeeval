package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by liyuntao on 2014/6/30.
 */
public class SIMPLE_SORTING {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] s = line.split("\\s+");
            double[] d = new double[s.length];
            for(int i = 0; i < s.length; i++) {
                d[i] = Double.parseDouble(s[i]);
            }

            Arrays.sort(d);

            for(int i = 0; i < d.length; i++) {
                System.out.printf("%.3f", d[i]);
                if(i != d.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
