package codeeval.hard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liyuntao on 2014/6/27.
 */
public class TEXT_TO_NUMBER {
    static Map<String, Integer> m1 = new HashMap<String, Integer>(){
        {
            put("zero", 0);
            put("one", 1);
            put("two", 2);
            put("three", 3);
            put("four", 4);
            put("five", 5);
            put("six", 6);
            put("seven", 7);
            put("eight", 8);
            put("nine", 9);
            put("ten", 10);
            put("eleven", 11);
            put("twelve", 12);
            put("thirteen", 13);
            put("fourteen", 14);
            put("fifteen", 15);
            put("sixteen", 16);
            put("seventeen", 17);
            put("eighteen", 18);
            put("nineteen", 19);
            put("twenty", 20);
            put("thirty", 30);
            put("forty", 40);
            put("fifty", 50);
            put("sixty", 60);
            put("seventy", 70);
            put("eighty", 80);
            put("ninety", 90);
        }
    };
    static Map<String, Integer> m2 = new HashMap<String, Integer>() {
        {
            put("hundred", 100);
            put("thousand", 1000);
            put("million", 1000000);
        }
    };

    private static int txt2num(String line) {
        String[] strs = line.split("\\s+");
        boolean neg = false;
        if("negative".equals(strs[0])) {
            neg = true;
        }
        int result = 0;
        int tmp_last = 0;
        for(int i = neg?1:0; i < strs.length; i++) {
            if(m2.containsKey(strs[i])) {
                if(m2.get(strs[i]) > 100 ) {
                    result += tmp_last * m2.get(strs[i]);
                    tmp_last = 0;
                } else {
                    tmp_last = tmp_last * m2.get(strs[i]);
                }
            } else {
                tmp_last += m1.get(strs[i]);
            }
        }
        result += tmp_last;
        return result * (neg?-1:1);
    }

    public static void main(String[] args) throws IOException {
//        System.out.println(txt2num("nine million twenty four thousand one hundred thirty six"));
//        System.out.println(txt2num("negative sixty five million two hundred sixty"));
//        System.out.println(txt2num("negative sixty five thousand two hundred sixty"));
//        System.out.println(txt2num("negative six million five hundred thousand two hundred sixty"));
//        System.out.println(txt2num("negative six hundred thirty eight"));
//        System.out.println(txt2num("two million one hundred seven"));
//        System.out.println(txt2num("nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine"));

        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(txt2num(line));
        }
    }
}
