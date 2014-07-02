package codeeval.hard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liyuntao on 2014/6/26.
 */
public class MINIMUM_PATH_SUM {
    private static int minimum_path_sum(int[][] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(i == 0 && j != 0) {
                    nums[i][j] += nums[i][j - 1];
                } else if(i != 0 && j == 0) {
                    nums[i][j] += nums[i - 1][j];
                } else if (i != 0 && j != 0) {
                    nums[i][j] += Math.min(nums[i][j - 1], nums[i - 1][j]);
                }
            }
        }
        return nums[nums.length - 1][nums.length - 1];
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);
            int[][] nums = new int[n][n];
            for(int i = 0; i < n; i++) {
                line = in.readLine();
                String[] num_str = line.split(",");
                for(int j = 0; j < n; j++) {
                    nums[i][j] = Integer.parseInt(num_str[j]);
                }
            }
            System.out.println(minimum_path_sum(nums));
        }
    }


//    public static void main(String[] args) {
//        int[][] a = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
//        minimum_path_sum(a);
//        System.out.println();
//        for(int i = 0; i < a.length; i++) {
//            for(int j = 0; j < a.length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
}
