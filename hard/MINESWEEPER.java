package codeeval.hard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liyuntao on 2014/6/26.
 */
public class MINESWEEPER {
    private static String output(String line) {
        int m = Integer.parseInt(line.split(";")[0].split(",")[0]);
        int n = Integer.parseInt(line.split(";")[0].split(",")[1]);
        String mine_str = line.split(";")[1];
        int[][] nums = new int[m][n];
        for(int i = 0; i < mine_str.length(); i++) {
            if(mine_str.charAt(i) == '*') {
                nums[i / n][i % n] = Integer.MIN_VALUE;
                sum1(nums, i/n - 1, i%n, m, n);
                sum1(nums, i/n, i%n - 1, m, n);
                sum1(nums, i/n - 1, i%n - 1, m, n);
                sum1(nums, i/n - 1, i%n + 1, m, n);
                sum1(nums, i/n + 1, i%n - 1, m, n);
                sum1(nums, i/n + 1, i%n + 1, m, n);
                sum1(nums, i/n + 1, i%n, m, n);
                sum1(nums, i/n, i%n + 1, m, n);
            }
        }

        char[] result = mine_str.toCharArray();

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(nums[i][j] >= 0) {
                    result[i * n + j] = (char)(nums[i][j] + '0');
                }
            }
        }
        return String.copyValueOf(result);
    }

    private static void sum1(int[][] A, int x, int y, int m, int n) {
        if(x < 0 || y < 0 || x > m - 1 || y > n - 1) return;
        A[x][y]++;
    }

    public static void main(String[] args) throws IOException {
//        System.out.println(output("4,4;*****.**********"));
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(output(line));
        }
    }
}
