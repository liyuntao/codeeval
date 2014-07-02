package codeeval.easy;

import java.io.*;

/**
 * Created by liyuntao on 2014/6/19.
 */
public class REVERSE_WORDS {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            line = line.trim();
            if(line.length() > 0) {
                String[] words = line.split("\\s+");
                StringBuilder sb = new StringBuilder("");
                for(int i=words.length-1;i>=0;i--) {
                    sb.append(words[i]).append(" ");
                }
                System.out.println(sb);
            }
        }
    }
}
