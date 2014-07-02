package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by liyuntao on 2014/6/26.
 */
public class LONGEST_WORD {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            String[] words = line.split("\\s+");
            int maxIndex = 0;
            for(int i = 1; i < words.length; i++) {
                if(words[i].length() > words[maxIndex].length()) {
                    maxIndex = i;
                }
            }
            System.out.println(words[maxIndex]);
        }
    }
}
