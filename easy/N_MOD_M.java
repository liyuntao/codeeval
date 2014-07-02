package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liyuntao on 2014/6/24.
 */
public class N_MOD_M {
    private static int mod(int n, int m) {
        if(n == 0 || m * m == 1) return 0;
        boolean neg = false;
        if(n < 0) neg = true;
        if(m == 1) return neg ? -1 : 1;
        m = Math.abs(m);
        n = Math.abs(n);

        int m_s;
        while(n >= m) {
            n -= m;
        }
        return neg ? -1*n : n;

    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] inner_args = line.split(",");
            System.out.println(mod(Integer.parseInt(inner_args[0]),
                    Integer.parseInt(inner_args[1])));
        }
    }
}
