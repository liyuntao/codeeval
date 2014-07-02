package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by liyuntao on 2014/6/25.
 */
public class UNIQUE_ELEMENTS {
    private static String unique_ele(String line) {
        Set<String> set=new LinkedHashSet<String>();
        set.addAll(Arrays.asList(line.split(",")));
        StringBuffer result = new StringBuffer();
        for(String s:set) {
            result.append(s).append(",");
        }
        return result.substring(0, result.length() - 1);
    }

    private static String unique_ele2(String line) {
        String[] num_strs= line.split(",");
        StringBuffer result = new StringBuffer();
        result.append(num_strs[0]);
        for(int i = 1; i < num_strs.length;i++) {
            if(num_strs[i].equals(num_strs[i-1])) {
                continue;
            } else {
                result.append(",").append(num_strs[i]);
            }
        }
        return result.toString();
    }

    private static void unique_ele3(String line) {
        String[] num_strs= line.split(",");
        System.out.print(num_strs[0]);
        for(int i = 1; i < num_strs.length;i++) {
            if(num_strs[i].equals(num_strs[i-1])) {
                continue;
            } else {
                System.out.print(","+num_strs[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            unique_ele3(line);
        }
    }
}
