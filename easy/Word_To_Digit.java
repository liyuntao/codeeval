package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liyuntao on 2014/6/24.
 */
public class Word_To_Digit {
    private static Map<String, Character> word2num = new HashMap<String, Character>(){
        {
            put("zero", '0');
            put("one", '1');
            put("two", '2');
            put("three", '3');
            put("four", '4');
            put("five", '5');
            put("six", '6');
            put("seven", '7');
            put("eight", '8');
            put("nine", '9');
        }
    };

    private static String transform(String line) {
        String[] input_str = line.split(";");
        char[] result = new char[input_str.length];
        for(int i=0; i<result.length;i++) {
            result[i] = word2num.get(input_str[i]);
        }
        return String.copyValueOf(result);
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(transform(line));
        }
    }
}
