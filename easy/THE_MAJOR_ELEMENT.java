package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liyuntao on 2014/6/23.
 */
public class THE_MAJOR_ELEMENT {
    private static String majorEle(String line) {
        String[] num_strs = line.split(",");
        int[] nums = new int[num_strs.length];
        nums[0] = Integer.parseInt(num_strs[0]);
        int curNum = nums[0];
        int curCount = 1;
        for(int i = 1;i < nums.length; i++) {
            nums[i] = Integer.parseInt(num_strs[i]);
            if(nums[i] == curNum) {
                curCount++;
            } else {
                curCount--;
                if(curCount < 0) {
                    curNum = nums[i];
                    curCount = 1;
                }
            }
        }

        int majorCount = 0;
        for(int i = 0;i < nums.length; i++) {
            if(nums[i] == curNum) {
                majorCount++;
            }
        }

        if(majorCount > nums.length/2) {
            return curNum + "";
        } else {
            return "None";
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(majorEle(line));
        }
    }
}
