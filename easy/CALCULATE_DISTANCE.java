package codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by liyuntao on 2014/6/30.
 */
public class CALCULATE_DISTANCE {

    private static int calc_distance(String line) {
        Pattern pattern = Pattern.compile("[-]?\\d+");
        Matcher matcher = pattern.matcher(line);

        matcher.find();
        int x1 = Integer.parseInt(matcher.group());
        matcher.find();
        int y1 = Integer.parseInt(matcher.group());
        matcher.find();
        int x2 = Integer.parseInt(matcher.group());
        matcher.find();
        int y2 = Integer.parseInt(matcher.group());

        return (int) Math.sqrt(Math.pow(y2-y1, 2) + Math.pow(x2-x1, 2));
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(calc_distance(line));
        }
    }
}
